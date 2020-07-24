package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

public class ParameterController {
    @FXML
    private JFXTextField oldUsername;

    @FXML
    private JFXTextField newUsername;

    @FXML
    private JFXPasswordField oldPassword;

    @FXML
    private JFXPasswordField newPassword;

    @FXML
    private JFXButton changeBtn;

    @FXML
    private JFXButton home;

    @FXML
    public void goToHome(ActionEvent event) throws IOException {
        Stage stage = (Stage)(((Node)(event.getSource())).getScene().getWindow());
        Parent root = FXMLLoader.load(getClass().getResource("/view/view1.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
}
