package ru.dadakin.dadakin_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MassaController {

    @FXML
    private Label Result;

    @FXML
    private TextField eden;

    @FXML
    private TextField massa;

    @FXML
    void btnResOnAction(ActionEvent event) {
        int num = Integer.parseInt(eden.getText().toString());
        double chis = Double.parseDouble(massa.getText().toString());
        switch (num) {
            case 1:
                double A = chis;
                Result.setText("Результат = " + A);
                break;
            case 2:
                double B = chis / 1000000;
                Result.setText("Результат = " + B);
                break;
            case 3:
                double C = chis / 1000;
                Result.setText("Результат = " + C);
                break;
            case 4:
                double D = chis * 1000;
                Result.setText("Результат = " + D);
                break;
            case 5:
                double E = chis * 100;
                Result.setText("Результат = " + E);
                break;
            default:
                Result.setText("Введите корректное число.");
        }
    }

}
