package ru.dadakin.dadakin_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class priController {

    @FXML
    private Label xRes;

    @FXML
    private TextField xTextFeild;

    @FXML
    void btnResOnAction(ActionEvent event) {
        float X = Float.parseFloat(xTextFeild.getText().toString());
        double B = pow(10, X + log(X));
        double A = 1 / cos(X) + log(abs(tan(X / 2))) + pow(B, 2);
        xRes.setText("Результат = "+ A);
    }

}
