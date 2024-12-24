module ru.dadakin.dadakin_task7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.dadakin.dadakin_task7 to javafx.fxml;
    exports ru.dadakin.dadakin_task7;
}