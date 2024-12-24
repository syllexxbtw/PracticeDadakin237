package ru.dadakin.dadakin_task7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DiapozonController {

    @FXML
    private Label Res;

    @FXML
    private TextField diapozon;

    @FXML
    void btnResOnAction(ActionEvent event) {
        int a=Integer.parseInt(diapozon.getText().toString());
        int b=a/10;
        int c= a %10;
        String uch;
        if((a>=10 && a<20) || a==40)
            switch(a) {
                case 10:
                    uch = "Десять учебных заданий. ";
                    break;
                case 11:
                    uch = "Одиннадцать учебных заданий. ";
                    break;
                case 12:
                    uch = "Двенадцать учебных заданий. ";
                    break;
                case 13:
                    uch = "Тринадцать учебных заданий. ";
                    break;
                case 14:
                    uch = "Четырнадцать учебных заданий. ";
                    break;
                case 15:
                    uch = "Пятнадцать учебных заданий. ";
                    break;
                case 16:
                    uch = "Шестнадцать учебных заданий. ";
                    break;
                case 17:
                    uch = "Семнадцать учебных заданий. ";
                    break;
                case 18:
                    uch = "Восемнадцать учебных заданий. ";
                    break;
                case 19:
                    uch = "Девятнадцать учебных заданий. ";
                    break;
                case 40:
                    uch = "Сорок учебных заданий. ";
                    break;
                default:
                    uch = "";
                    break;
            }
        else {
            switch (b) {
                case 2:
                    uch = "Двадцать ";
                    break;
                case 3:
                    uch = "Тридцать ";
                    break;
                default:
                    uch = "Ошибка. ";
                    break;
            }
            if (b >= 2 && b < 4)
                switch (c) {
                    case 0:
                        uch += " учебных заданий. ";
                        break;
                    case 1:
                        uch += " одно учебное заданий. ";
                        break;
                    case 2:
                        uch += " два учебных заданий. ";
                        break;
                    case 3:
                        uch += " три учебных заданий. ";
                        break;
                    case 4:
                        uch += " четыре учебных заданий. ";
                        break;
                    case 5:
                        uch += " пять учебных заданий. ";
                        break;
                    case 6:
                        uch += " шесть учебных заданий. ";
                        break;
                    case 7:
                        uch += " семь учебных заданий. ";
                        break;
                    case 8:
                        uch += " восемь учебных заданий. ";
                        break;
                    case 9:
                        uch += " девять учебных заданий. ";
                        break;
                    default:
                        break;

                }
        }
        Res.setText(uch);
    }

}