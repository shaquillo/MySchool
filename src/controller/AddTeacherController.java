package controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AddTeacherController {

    @FXML
    private TextField teacherName;

    @FXML
    private DatePicker date;

    @FXML
    private JFXComboBox<?> classTime;

    @FXML
    private ToggleGroup gender;

    @FXML
    private Button addBtn;

    @FXML
    private Button resetBtn;

    @FXML
    private ImageView closeImage;

    @FXML
    void closeImageClick(MouseEvent event) {
        Stage stage = (Stage)(((Node)event.getSource()).getScene().getWindow());
        stage.close();
    }

}
