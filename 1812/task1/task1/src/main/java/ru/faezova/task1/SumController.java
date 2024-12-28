package ru.faezova.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField kTextField;

    @FXML
    private TextField mTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;
    private Object Console;

    @FXML
    void sumButtonOnAction(ActionEvent event) {

        int number = 257;
        Console.equals(number / 100 > number / 10 % 10 ? number / 100 : number / 10 % 10);
    }

    public void onHelloButtonClick(ActionEvent actionEvent) {

    }
}
