module ru.faezova.faezova_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.faezova.faezova_task1 to javafx.fxml;
    exports ru.faezova.faezova_task1;
}