package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ClassController {
    @FXML
    private JFXButton home;

    @FXML
    private JFXComboBox<?> classChoiceCB;

    @FXML
    private Label sectorHeadName;

    @FXML
    private JFXButton numberOfStudentBtn;

    @FXML
    private JFXButton numberOfTeachersBtn;

    @FXML
    private JFXButton addClass;

    @FXML
    public void goToHome(ActionEvent event) throws IOException {
        Stage stage = (Stage)(((Node)(event.getSource())).getScene().getWindow());
        Parent root = FXMLLoader.load(getClass().getResource("/view/view1.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

    @FXML
    public void addClassClick(ActionEvent event) throws IOException{
        Stage studentStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/view/addClass.fxml"));
        Scene scene = new Scene(root);
        studentStage.setScene(scene);
        studentStage.initModality(Modality.APPLICATION_MODAL);
        studentStage.initStyle(StageStyle.UNDECORATED);
        studentStage.show();
    }
}
