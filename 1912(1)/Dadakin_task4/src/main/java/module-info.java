module ru.dadakin.dadakin_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dadakin.dadakin_task4 to javafx.fxml;
    exports ru.dadakin.dadakin_task4;
}