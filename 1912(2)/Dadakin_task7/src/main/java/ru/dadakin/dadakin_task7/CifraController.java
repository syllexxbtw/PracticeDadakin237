package ru.dadakin.dadakin_task7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CifraController {

    @FXML
    private Label Result;

    @FXML
    private TextField cifra;

    @FXML
    void btnResOnAction(ActionEvent event) {
        int A = Integer.parseInt(cifra.getText().toString());
        String num;
        if (A <= 0 || A >= 1000) {
            num = "Ошибка, неверно введено число.";
        } else if (A <= 9) {
            num = "Однозначное.";
        } else if (A <= 99) {
            num = "Двузначное.";
        } else {
            num = "Трёхзначное.";
        } if (A % 2 == 0 && A > 0 && A < 1000) {
            num = "Чётное число.";
        } else if ((A & 2) != 0 && A > 0 && A < 1000) {
            num = "Нечётное число.";
        }
            Result.setText(num);
        }
    }