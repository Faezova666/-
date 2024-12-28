module ru.faezova.faezova_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.faezova.faezova_task1 to javafx.fxml;
    exports ru.faezova.faezova_task1;
    exports ru.faezova.faezova_task1.controller;
    opens ru.faezova.faezova_task1.controller to javafx.fxml;
}