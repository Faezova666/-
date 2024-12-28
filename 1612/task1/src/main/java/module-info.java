module ru.faezova.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.faezova.task1 to javafx.fxml;
    exports ru.faezova.task1;
}