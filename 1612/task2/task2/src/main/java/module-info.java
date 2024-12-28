module ru.faezova.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.faezova.task2 to javafx.fxml;
    exports ru.faezova.task2;
}