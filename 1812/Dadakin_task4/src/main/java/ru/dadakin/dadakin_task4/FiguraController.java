package ru.dadakin.dadakin_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FiguraController {

    @FXML
    private Label Result;

    @FXML
    private TextField dTextField;

    @FXML
    private TextField sTextField;

    @FXML
    private TextField shTextField;

    @FXML
    void btnResOnAction(ActionEvent event) {
        int A = Integer.parseInt(dTextField.getText().toString());
        int B = Integer.parseInt(shTextField.getText().toString());
        int C = Integer.parseInt(sTextField.getText().toString());
        int Kd = A / C;
        int Ksh = B / C;
        int V = Kd * Ksh;
        int PP = A * B;
        int P = V * (C * C);
        int F = PP - P;
        Result.setText("Кол-во квадратов = " + V + "\nПлощадь = " + F);
    }

}
