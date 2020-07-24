package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class addClassController {

    @FXML
    private TextField className;

    @FXML
    private Button addBtn;

    @FXML
    private Button cancelBtn;

    @FXML
    public void cancelClick(ActionEvent event){
        Stage stage = (Stage)(((Node)event.getSource()).getScene().getWindow());
        stage.close();
    }

    @FXML
    public void addClassClick(ActionEvent event){
        String newClass = className.getText();
        System.out.println(newClass);
        className.setText("");
    }

}
