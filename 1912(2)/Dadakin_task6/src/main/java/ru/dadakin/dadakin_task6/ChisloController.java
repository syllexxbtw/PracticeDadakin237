package ru.dadakin.dadakin_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ChisloController {

    @FXML
    private Label Result;

    @FXML
    private TextField chslo;

    @FXML
    void btnResOnAction(ActionEvent event) {
        int A = Integer.parseInt(chslo.getText().toString());
        String num;
        if (A == 0) {
            num = "Нулевое число.";
        } else if (A > 0) {
            if (A % 2 == 0) {
                num = "Положительное чётное число.";
            } else {
                num = "Положительное нечётное число.";
            }
        }else {
            if (A % 2 == 0) {
                num = "Отрицательно чётное число.";
            } else {
                num = "Отрицательное нечётное число.";
            }
        }
        Result.setText(num);
    }
}
