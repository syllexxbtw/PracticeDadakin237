module ru.dadakin.dadakin_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dadakin.dadakin_task1 to javafx.fxml;
    exports ru.dadakin.dadakin_task1;
}