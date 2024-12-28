package ru.faezove.faezova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aInput;

    @FXML
    private Label yOutput;

    @FXML
    void Button(ActionEvent event) {
        try{
            double a = Double.parseDouble(aInput.getText());
            double x = a / 12.0;
            double b = Math.exp(-a * x);
            double y = 1 - Math.exp(-a * x) * Math.sin(a * x + b);
            yOutput.setText(String.format("%.5f",y));
        } catch (NumberFormatException e){
            yOutput.setText("Некорректный ввод");
        }

    }
    }


