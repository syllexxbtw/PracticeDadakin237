package ru.dadakin.dadakin_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import static java.lang.Math.pow;

public class For5Controller {

    @FXML
    private ImageView Image;

    @FXML
    private Label Res;

    @FXML
    void btnResOnAction(ActionEvent event) {
        double[] a = new double[15];
        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i < 15; i++) {
            a[i] = a[i - 2] + (a[i - 1] / pow(2, i - 1));
        }

        double product = 1.0;
        for (int i = 0; i < 15; i++) {
            product *= a[i];
        }
        Res.setText("Результат = " + product);
    }
}