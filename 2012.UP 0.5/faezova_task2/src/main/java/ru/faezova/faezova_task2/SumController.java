package ru.faezova.faezova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerlbl;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<?> dataListView;

    @FXML
    private TextField nubT;

    @FXML
    private TextField nubt;

    @FXML
    void OkButtonOnAction(ActionEvent event) {

    }

    @FXML
    void addButtonOnAction(ActionEvent event) {

    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        try {
            int a = Integer.parseInt(nubT.getText());
            int b = Integer.parseInt(nubt.getText());

            int count = 0;
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }

            answerlbl.setText("Количество четных чисел: " + count);
        } catch (NumberFormatException e) {
            answerlbl.setText("Некорректный ввод!");
        }
    }
}
