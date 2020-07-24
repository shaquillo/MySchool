package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.stage.StageStyle;


public class TeacherController {
    @FXML
    private JFXButton addBtn;

    @FXML
    private JFXButton removeBtn;

    @FXML
    private JFXButton numberOfTeachers;

    @FXML
    private JFXButton ShowDetailBtn;

    @FXML
    private JFXButton home;

    @FXML
    public void goToHome(ActionEvent event) throws IOException {
        Stage stage = (Stage)(((Node)(event.getSource())).getScene().getWindow());
        Parent root = FXMLLoader.load(getClass().getResource("/view/view1.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

    @FXML
    public void addTeacher(ActionEvent event) throws IOException{
        Stage studentStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/view/addTeacher.fxml"));
        Scene scene = new Scene(root);
        studentStage.setScene(scene);
        studentStage.initModality(Modality.APPLICATION_MODAL);
        studentStage.initStyle(StageStyle.UNDECORATED);
        studentStage.show();
    }
}
