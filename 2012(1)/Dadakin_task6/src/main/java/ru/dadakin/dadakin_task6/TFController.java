package ru.dadakin.dadakin_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TFController {

    @FXML
    private Label Result;

    @FXML
    private TextField n;

    @FXML
    void btnResOnAction(ActionEvent event) {
        int N = Integer.parseInt(n.getText().toString());
        boolean TF = false;

        while (N > 0) {
            int ostatok = N % 10;
            if (ostatok % 2 == 0) {
                TF = true;
                break;
            }
            N = N / 10;
        }
        Result.setText("Результат = " + TF);
    }

}
