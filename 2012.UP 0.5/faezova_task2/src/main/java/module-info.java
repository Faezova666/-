module ru.faezova.faezova_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.faezova.faezova_task2 to javafx.fxml;
    exports ru.faezova.faezova_task2;
}