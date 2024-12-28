package ru.faezova.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button ResButton;

    @FXML
    private Label ResLabel;

    @FXML
    private TextField kTextField;

    @FXML
    int sumButtonOnAction(ActionEvent event) {
        int K = Integer.parseInt(kTextField.getText().toString());
        int N = (K + 5) % 7;
        ResLabel.setText("день недели:" + N);

        return K;


    }

}
