package com.zergatstage.monitor;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.text.SimpleDateFormat;

public class Client {
    public Client() {
        // Initialize properties in the constructor
        this.clientId = new SimpleIntegerProperty();
        this.document = new SimpleStringProperty();
        this.surName = new SimpleStringProperty();
        this.firstName = new SimpleStringProperty();
        this.patronymic = new SimpleStringProperty();
        this.birthDate = new SimpleStringProperty();
    }

    public int getClientId() {
        return clientId.get();
    }

    public SimpleIntegerProperty clientIdProperty() {
        return clientId;
    }

    private SimpleIntegerProperty clientId;

    public String getDocument() {
        return document.get();
    }

    public void setClientId(int clientId) {
        this.clientId.set(clientId);
    }

    public void setDocument(String document) {
        this.document.set(document);
    }

    public String getSurName() {
        return surName.get();
    }

    public SimpleStringProperty surNameProperty() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName.set(surName);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getPatronymic() {
        return patronymic.get();
    }

    public SimpleStringProperty patronymicProperty() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic.set(patronymic);
    }

    public SimpleStringProperty documentProperty() {
        return document;
    }

    private SimpleStringProperty document;
    private SimpleStringProperty surName;
    private SimpleStringProperty firstName;
    private SimpleStringProperty patronymic;
    private SimpleStringProperty birthDate;

    public String getBirthDate() {
        return birthDate.get();
    }

    public SimpleStringProperty birthDateProperty() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate.set(birthDate);
    }
}
