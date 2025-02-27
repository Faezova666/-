package ru.faezova.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button ResButton;

    @FXML
    private Label resLabel;

    @FXML
    private TextField xTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        double x=Double.parseDouble(xTextField.getText().toString());
        double y= 3* Math.pow(x,6) - 6 * Math.pow(x,2)-7;
        resLabel.setText("При x="+ x + ", y=" + y);

    }

}
