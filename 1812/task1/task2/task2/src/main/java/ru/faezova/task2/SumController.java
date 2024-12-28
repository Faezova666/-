package ru.faezova.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField kTextFIeid;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;
    private SumController resultOutput;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        try {
            int number;
            int K = Integer.parseInt(kTextFIeid.getText());
            if(K < 100 || K > 999){
                kTextFIeid.setText("Некорректный ввод");
                return;
            }

            int hundreds = K / 100;
            int tens = (K/ 10) % 10;
            int ones = K % 10;

            int swappedNumber = tens * 100 + hundreds * 10 + ones;

            resultOutput.setText(String.valueOf(swappedNumber));
        } catch(NumberFormatException e){
            resultOutput.setText("Некорректный ввод");
        }
    }

    private void setText(String некорректныйВвод) {

    }
}



