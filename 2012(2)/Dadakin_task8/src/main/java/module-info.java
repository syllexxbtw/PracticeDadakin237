module ru.dadakin.dadakin_task8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dadakin.dadakin_task8 to javafx.fxml;
    exports ru.dadakin.dadakin_task8;
}