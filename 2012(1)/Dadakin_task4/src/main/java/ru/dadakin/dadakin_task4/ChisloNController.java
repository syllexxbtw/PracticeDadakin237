package ru.dadakin.dadakin_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ChisloNController {

    @FXML
    private Label Result;

    @FXML
    private TextField n;

    @FXML
    void btnResOnAction(ActionEvent event) {
        int N = Integer.parseInt(n.getText().toString());
        int K = 1;
        while (K * K <= N) {
            K++;
        }
        Result.setText("Наименьшее целое положительное число K = " + K);
    }
}
