package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller1 implements Initializable {

    @FXML
    private BorderPane borderPane;

    @FXML
    private ImageView logout;

    @FXML
    private JFXButton classes;

    @FXML
    private JFXButton students;

    @FXML
    private JFXButton teachers;

    @FXML
    private JFXButton administration;

    @FXML
    private JFXButton classes1;

    @FXML
    private JFXButton students1;

    @FXML
    private JFXButton teachers1;

    @FXML
    private JFXButton administration1;

    @FXML
    private JFXButton parameters;

    @FXML
    private JFXButton exit;

    @FXML
    private AnchorPane pageOutput;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void makeLogOut(MouseEvent event) throws IOException {
        Stage currentStage = (Stage)(((Node)(event.getSource())).getScene().getWindow());
        currentStage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/view/sample.fxml"));
        primaryStage.setTitle("MySchool");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    public void classes_btn_click(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/classView.fxml"));
        pageOutput = loader.load();
        borderPane.setCenter(pageOutput);
    }

    @FXML
    public void student_btn_click(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/studentView.fxml"));
        pageOutput = loader.load();
        borderPane.setCenter(pageOutput);
    }

    @FXML
    public void teacher_btn_click(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/teacherView.fxml"));
        pageOutput = loader.load();
        borderPane.setCenter(pageOutput);
    }

    @FXML
    public void admin_btn_click(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/adminView.fxml"));
        pageOutput = loader.load();
        borderPane.setCenter(pageOutput);
    }

    @FXML
    public void parameter_btn_click(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/parameterView.fxml"));
        pageOutput = loader.load();
        borderPane.setCenter(pageOutput);
    }

    @FXML
    public void exit_btn_click(ActionEvent event){
        Stage currentStage = (Stage)(((Node)event.getSource()).getScene().getWindow());
        currentStage.close();
    }
}
