package ru.dadakin.dadakin_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class For4Controller {

    @FXML
    private Label Res;

    @FXML
    private TextField n;

    @FXML
    void btnResOnAction(ActionEvent event) {
        int N = Integer.parseInt(n.getText().toString());
        double sum = 0;
        double factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= i;
            sum += 1 / factorial;
        }
        Res.setText("Результат = " + sum);
    }
}