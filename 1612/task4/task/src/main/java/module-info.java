module ru.faezova.task {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.faezova.task to javafx.fxml;
    exports ru.faezova.task;
}