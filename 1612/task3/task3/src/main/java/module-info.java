module ru.faezova.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.faezova.task3 to javafx.fxml;
    exports ru.faezova.task3;
}