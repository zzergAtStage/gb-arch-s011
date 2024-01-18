package com.zergatstage.monitor;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class MyJavaFXApp extends Application {
    private TableView<Client> tableView;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        tableView = new TableView<>();
        updateData();
        ObservableList<Client> data = FXCollections.observableArrayList(DataService.fetchData());

        TableColumn<Client, Integer> clientIdCol = new TableColumn<>("Client ID");
        clientIdCol.setCellValueFactory(cellData -> cellData.getValue().clientIdProperty().asObject());

        TableColumn<Client, String> documentCol = new TableColumn<>("Document");
        documentCol.setCellValueFactory(cellData -> cellData.getValue().documentProperty());

        TableColumn<Client, String> firstName = new TableColumn<>("First name");
        firstName.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());

        TableColumn<Client, String> lastName = new TableColumn<>("Last name");
        lastName.setCellValueFactory(cellData -> cellData.getValue().surNameProperty());


        Button updateButton = new Button("Update");
        //TODO: add a pagination?
        updateButton.setOnAction(event -> updateData());

        tableView.getColumns().addAll(clientIdCol, documentCol, firstName, lastName /* Add more columns here */);
        tableView.setItems(data);

        VBox vbox = new VBox(updateButton, tableView); // Add the button above the table
        Scene scene = new Scene(vbox);


        stage.setScene(scene);
        stage.setTitle("Client Data Table");
        stage.show();
    }

    private void updateData() {
        List<Client> newData = DataService.fetchData();
        if (newData != null) {
            tableView.getItems().setAll(newData);
        }
    }
}
