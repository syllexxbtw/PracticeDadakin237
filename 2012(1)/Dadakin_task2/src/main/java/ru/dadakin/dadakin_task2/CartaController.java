package ru.dadakin.dadakin_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CartaController {

    @FXML
    private Label Result;

    @FXML
    private Label Result2;

    @FXML
    private TextField mast;

    @FXML
    private TextField nomer;

    @FXML
    void btnResOnAction(ActionEvent event) {
        int M = Integer.parseInt(mast.getText().toString());
        int N = Integer.parseInt(nomer.getText().toString());
        switch (N) {
            case 6:
                Result.setText("Результат = Шестёрка ");
                break;
            case 7:
                Result.setText("Результат = Семёрка ");
                break;
            case 8:
                Result.setText("Результат = Восьмёрка ");
                break;
            case 9:
                Result.setText("Результат = Девятка ");
                break;
            case 10:
                Result.setText("Результат = Десятка ");
                break;
            case 11:
                Result.setText("Результат = Валет ");
                break;
            case 12:
                Result.setText("Результат = Дама ");
                break;
            case 13:
                Result.setText("Результат = Король ");
                break;
            case 14:
                Result.setText("Результат = Туз ");
                break;
            default:
                Result.setText("Ошибка. Введите корректные данные.");
        }

        switch (M) {
            case 1:
                Result2.setText("пики.");
                break;
            case 2:
                Result2.setText("трефы.");
                break;
            case 3:
                Result2.setText("бубны.");
                break;
            case 4:
                Result2.setText("черви.");
                break;
            default:
                Result2.setText("Ошибка. Введите корректные данные.");
        }
    }
}
