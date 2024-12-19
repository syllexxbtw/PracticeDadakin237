package ru.dadakin.dadakin_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SredneeController {

    @FXML
    private Label Result;

    @FXML
    private TextField first;

    @FXML
    private TextField second;

    @FXML
    private TextField third;

    @FXML
    void btnResOnAction(ActionEvent event) {
        int A = Integer.parseInt(first.getText().toString());
        int B = Integer.parseInt(second.getText().toString());
        int C = Integer.parseInt(third.getText().toString());
        if (A < B && A > C) {
            Result.setText("Среднее число: " + A);
        } else {
            if (A > B && A < C) {
                Result.setText("Среднее число равно: " + A);
            } else {
                if (B > A && B < C) {
                    Result.setText("Среднее число равно: " + B);
                } else {
                    if (B < A && B > C) {
                        Result.setText("Среднее число равно: " + B);
                    } else {
                        if (C > A && C < B) {
                            Result.setText("Среднее число равно: " + C;
                        } else {
                            if (C < A && C > B) {
                                Result.setText("Среднее число равно: " + C);
                            } else {
                                Result.setText("Нету среднего значения: ");
                            }
                        }
                    }
                }
            }
        }
    }

}
