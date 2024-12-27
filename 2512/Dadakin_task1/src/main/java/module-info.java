module ru.dadakin.dadakin_task1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.dadakin.dadakin_task1 to javafx.fxml;
    exports ru.dadakin.dadakin_task1;
    exports ru.dadakin.dadakin_task1.controller;
    opens ru.dadakin.dadakin_task1.controller to javafx.fxml;
}