module ru.dadakin.dadakin_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dadakin.dadakin_task6 to javafx.fxml;
    exports ru.dadakin.dadakin_task6;
}