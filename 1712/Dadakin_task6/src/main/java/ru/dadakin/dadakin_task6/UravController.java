package ru.dadakin.dadakin_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UravController {

    @FXML
    private Label Res;

    @FXML
    private TextField a1TextField;

    @FXML
    private TextField a2TextField;

    @FXML
    private TextField b1TextField;

    @FXML
    private TextField b2TextField;

    @FXML
    private TextField c1TextField;

    @FXML
    private TextField c2TextField;

    @FXML
    void btnResOnAction(ActionEvent event) {
        double A1 = Double.parseDouble(a1TextField.getText().toString());
        double B1 = Double.parseDouble(b1TextField.getText().toString());
        double C1 = Double.parseDouble(c1TextField.getText().toString());
        double A2 = Double.parseDouble(a2TextField.getText().toString());
        double B2 = Double.parseDouble(b2TextField.getText().toString());
        double C2 = Double.parseDouble(c2TextField.getText().toString());
        double D = A1 * B2 - A2 * B1;
        if (D != 0) {
            double X = (C1 * B2 - C2 * B1) / D;
            double Y = (A1 * C2 - A2 * C1) / D;
            Res.setText("Решение = X = " + X + ", Y = " + Y);
        } else {
            Res.setText("Нету решений.");
        }
    }
}
