package ru.dadakin.dadakin_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PoryadokController {

    @FXML
    private Label Result;

    @FXML
    private TextField first;

    @FXML
    private TextField second;

    @FXML
    void ResOnAction(ActionEvent event) {
        int A = Integer.parseInt(first.getText().toString());
        int B = Integer.parseInt(second.getText().toString());
        if( A < B) {
            Result.setText("Порядковый номер: 1");
        } else {
            if (B < A)
            Result.setText("Порядковый номер: 1");
        }
    }

}
