package ru.dadakin.dadakin_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CisloController {

    @FXML
    private Label Result;

    @FXML
    private TextField cislo;

    @FXML
    private TextField kTextField;

    @FXML
    void ResOnAction(ActionEvent event) {
        int C = Integer.parseInt(cislo.getText().toString());
        int K = Integer.parseInt(kTextField.getText().toString());
        if (K < 2 && K > 2) {
            int A = C / K;
            Result.setText("Результат = " + A);
        } else {
            Result.setText("Число чётное и не является верным.");
        }
        if(K < 1) {
            Result.setText("Число равно нулю или отрицательное.");
        } else {
            int A = C / K;
            Result.setText("Результат = "+ A);

        }
    }


}
