package ru.faezova.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label ATextField;

    @FXML
    private TextField aTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
int A = Integer.parseInt(aTextField.getText().toString());
int A2= A * A;
int A4= A2 * A2;
int A8= A4 * A4;
resLabel.setText("A2=" +A2);
        resLabel.setText("A4=" +A4);
        resLabel.setText("A8=" +A8);


    }

}
