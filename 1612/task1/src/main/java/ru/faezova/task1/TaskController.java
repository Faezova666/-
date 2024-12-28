package ru.faezova.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.sqrt;

public class TaskController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Label gipLabel;

    @FXML
    private Button goButton;

    @FXML
    private Label perLabel;

    @FXML
    void goButtonOnAction(ActionEvent event) {
        float a=Float.parseFloat(aTextField.getText().toString());
        float b=Float.parseFloat(bTextField.getText().toString());
        float c=(float)sqrt(a*a+b*b);
        gipLabel.setText("");
    }

}
