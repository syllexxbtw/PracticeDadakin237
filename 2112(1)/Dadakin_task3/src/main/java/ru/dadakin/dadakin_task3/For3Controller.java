package ru.dadakin.dadakin_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class For3Controller {

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
        int result = 1;
        for (var i = A; i <= B; i++) {
            result *= i;
        }
        Res.setText("Результат = " + result);
    }
}
