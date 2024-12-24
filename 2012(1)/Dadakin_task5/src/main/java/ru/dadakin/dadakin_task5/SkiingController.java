package ru.dadakin.dadakin_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SkiingController {

    @FXML
    private Label Result;

    @FXML
    private TextField p;

    @FXML
    void btnResOnAction(ActionEvent event) {
        double P = Double.parseDouble(p.getText().toString());
        double S = 10;
        int K = 1;
        while (S <= 200) {
            S += S * (P / 100);
            K++;
        }
        Result.setText("Кол-во дней, которое потребовалось = " + K + "\nСуммарный пробег составил = " + S);
    }

}
