module ru.faezova.faezova_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.faezova.faezova_task3 to javafx.fxml;
    exports ru.faezova.faezova_task3;
}