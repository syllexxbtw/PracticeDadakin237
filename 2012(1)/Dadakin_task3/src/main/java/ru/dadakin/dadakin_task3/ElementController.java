package ru.dadakin.dadakin_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ElementController {

    @FXML
    private Label Result;

    @FXML
    private TextField elem;

    @FXML
    private TextField znach;

    @FXML
    void btnResOnAction(ActionEvent event) {
        int E = Integer.parseInt(elem.getText().toString());
        double Z = Double.parseDouble(znach.getText().toString());
        double A = 5, C = 7, H = 3.5, S = 14;
        if (E == 1) {
            switch (E) {
                case 1:
                    A = Z;
                    C = A * sqrt(2);
                    H = C / 2;
                    S = C * (H / 2);
                    Result.setText("Катет = " + A + "\n Гипотенуза = " + C + "\n Высота = " + H + "\n Площадь = " + S);
                    break;
            }
        } else if (E == 2) {
            switch (E) {
                case 2:
                    A = pow(C, 2) / pow(A, 2);
                    C = Z;
                    H = C / 2;
                    S = C * (H / 2);
                    Result.setText("Катет = " + A + "\n Гипотенуза = " + C + "\n Высота = " + H + "\n Площадь = " + S);
                    break;
            }
        } else if (E == 3) {
            switch (E) {
                case 3:
                    A = pow(C, 2) / pow(A, 2);
                    C = A * sqrt(2);
                    H = Z;
                    S = C * (H / 2);
                    Result.setText("Катет = " + A + "\n Гипотенуза = " + C + "\n Высота = " + H + "\n Площадь = " + S);
                    break;
            }
        } else if (E == 4) {
            switch (E) {
                case 4:
                    A = pow(C, 2) / pow(A, 2);
                    C = A * sqrt(2);
                    H = C / 2;
                    S = Z;
                    Result.setText("Катет = " + A + "\n Гипотенуза = " + C + "\n Высота = " + H + "\n Площадь = " + S);
                    break;
                    }
                } else {
                    Result.setText("Ошибка. Введите корректный элемент.");
        }
    }
}
