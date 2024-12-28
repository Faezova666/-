module ru.faezova.faezova_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.faezova.faezova_task4 to javafx.fxml;
    exports ru.faezova.faezova_task4;
}