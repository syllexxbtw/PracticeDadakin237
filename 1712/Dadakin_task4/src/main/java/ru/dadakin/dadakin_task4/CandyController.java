package ru.dadakin.dadakin_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CandyController {

    @FXML
    private TextField aTextField;

    @FXML
    private Label oneRes;

    @FXML
    private TextField xTextField;

    @FXML
    private Label yRes;

    @FXML
    private TextField yTextField;

    @FXML
    void ResOnAction(ActionEvent event) {
        int X = Integer.parseInt(xTextField.getText().toString());
        int A = Integer.parseInt(aTextField.getText().toString());
        int Y = Integer.parseInt(yTextField.getText().toString());
        int N = A / X;
        int M = Y * N;
        oneRes.setText("Результат 1 кг = " + N);
        yRes.setText("Результат Y конфет = " + M);
    }

}
