package ru.faezova.task3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javax.swing.*;

class SumController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        JEditorPane kTextField = null;
        try {
            int dayOfYear = Integer.parseInt(kTextField.getText());
            if (dayOfYear < 1 || dayOfYear > 365) {
                kTextField.setText("Некорректный ввод");
                return;
            }

            int dayOfWeek = (dayOfYear + 0) % 7; // 1 января - вторник, что есть 2 день недели. Сдвиг равен нулю.
            String dayName;
            switch (dayOfWeek){
                case 1 : dayName = "Понедельник"; break;
                case 2 : dayName = "Вторник"; break;
                case 3 : dayName = "Среда"; break;
                case 4 : dayName = "Четверг"; break;
                case 5 : dayName = "Пятница"; break;
                case 6 : dayName = "Суббота"; break;
                case 0 : dayName = "Воскресенье"; break;
                default: dayName = "Ошибка";
            }
            kTextField.setText(dayName);
        } catch (NumberFormatException e){
            kTextField.setText("Некорректный ввод");
        }
    }

}

