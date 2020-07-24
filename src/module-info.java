module MySchool {
    requires javafx.fxml;
    requires javafx.controls;
    requires com.jfoenix;
    requires java.sql;

    opens model;
    exports controller to javafx.fxml;
    opens controller to javafx.fxml;
}