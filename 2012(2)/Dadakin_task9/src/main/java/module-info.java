module ru.dadakin.dadakin_task9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dadakin.dadakin_task9 to javafx.fxml;
    exports ru.dadakin.dadakin_task9;
}