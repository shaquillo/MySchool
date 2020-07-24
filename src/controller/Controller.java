package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private AnchorPane loginHolder;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private ImageView login;

    @FXML
    private Label message;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        RequiredFieldValidator validatorU = new RequiredFieldValidator();
        RequiredFieldValidator validatorP = new RequiredFieldValidator();
        username.getValidators().add(validatorU);
        password.getValidators().add(validatorP);
        validatorP.setMessage("password required");
        validatorU.setMessage("username required");
        username.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if(!newValue){
                    username.validate();
                }
            }
        });
        password.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if(!newValue){
                    password.validate();
                }
            }
        });
    }

    @FXML
    private void mylogin(MouseEvent event){
        try{
            String givenUsername = username.getText();
            String givenPassword = password.getText();
            if(givenUsername.equals("shaq") && givenPassword.equals("admin")){
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/myschool?useTimezone=true&serverTimezone=UTC";
                //Connection connection = DriverManager.getConnection(url,"shaq","shaquillo25");
                Stage currentStage = (Stage) (((Node)(event.getSource())).getScene().getWindow());
                Stage stage1 = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/view/view1.fxml"));
                Scene scene = new Scene(root1);
                scene.setFill(Color.TRANSPARENT);
                stage1.setScene(scene);
                stage1.initStyle(StageStyle.TRANSPARENT);
                stage1.show();
                currentStage.close();
            } else {
                message.setTextFill(Color.RED);
                message.setText("*Wrong credentrials*");
            }
        } catch (ClassNotFoundException e) {
            message.setText("Database connection problem");
        } /*catch (SQLException e) {
            message.setTextFill(Color.RED);
            message.setText("*Wrong db Credentials*");
        }*/ catch (Exception e){
            System.out.println("could not load Stage");
        }

    }

}
