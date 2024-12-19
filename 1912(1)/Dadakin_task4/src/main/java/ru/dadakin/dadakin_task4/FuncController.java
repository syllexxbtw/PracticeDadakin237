package ru.dadakin.dadakin_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class FuncController {

    @FXML
    private Label Result;

    @FXML
    private TextField kTextField;

    @FXML
    private TextField xTextField;

    @FXML
    void btnResOnAction(ActionEvent event) {
        int X = Integer.parseInt(xTextField.getText().toString());
        int K = Integer.parseInt(kTextField.getText().toString());
        double Y;
        if (K == 3) {
            Y = sin(X) + 2;
            Result.setText("Y = " + Y);
        } else {
            if (K == 20) {
                Y = pow(cos(X), 2);
                Result.setText("Y = " + Y);
            } else {
                if (K == 10 || K == 15) {
                    Y = tan(X) + sin(X);
                    Result.setText("Y = " + Y);
                } else {
                    Result.setText("Нету решений.");
                }

            }
        }
    }
}