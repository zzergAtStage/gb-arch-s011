module com.zergatstage.monitor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.dataformat.xml;

    opens com.zergatstage.monitor to javafx.fxml;
    exports com.zergatstage.monitor;
}