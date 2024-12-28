module ru.faezova.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.faezova.task4 to javafx.fxml;
    exports ru.faezova.task4;
}