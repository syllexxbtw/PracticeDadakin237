module ru.dadakin.dadakin_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dadakin.dadakin_task3 to javafx.fxml;
    exports ru.dadakin.dadakin_task3;
}