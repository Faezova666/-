module ru.faezova.faezova_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.faezova.faezova_task5 to javafx.fxml;
    exports ru.faezova.faezova_task5;
}