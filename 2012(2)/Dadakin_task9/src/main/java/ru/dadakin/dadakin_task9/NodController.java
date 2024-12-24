package ru.dadakin.dadakin_task9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NodController {

    @FXML
    private Label Res;

    @FXML
    private TextField a;

    @FXML
    private TextField b;

    @FXML
    void btnResOnAction(ActionEvent event) {
        int A = Integer.parseInt(a.getText().toString());
        int B = Integer.parseInt(b.getText().toString());
        if (A <= 0 || B <= 0) {
            Res.setText("Числа должны быть положительными.");
            return;
        }

        int C;
        while (B != 0) {
            C =  B;
            B = A % B;
            A = C;
        }

        Res.setText("Наибольшый делитель " + A);
    }
}