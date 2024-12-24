module ru.dadakin.dadakin_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dadakin.dadakin_task2 to javafx.fxml;
    exports ru.dadakin.dadakin_task2;
}