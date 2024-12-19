module ru.dadakin.dadakin_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dadakin.dadakin_task5 to javafx.fxml;
    exports ru.dadakin.dadakin_task5;
}