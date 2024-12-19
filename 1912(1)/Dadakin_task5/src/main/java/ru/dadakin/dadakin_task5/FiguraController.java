package ru.dadakin.dadakin_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

import java.io.InputStream;

public class FiguraController {

    @FXML
    private Label Result;

    @FXML
    private TextField xText;

    @FXML
    private TextField yText;

    @FXML
    void btnResOnAction(ActionEvent event) {
        float X = Float.parseFloat(xText.getText().toString());
        float Y = Float.parseFloat(yText.getText().toString());
        if (Y < 0 && X >= -23 && X <= 0 && Y > X) {
            Result.setText("Да.");
        } else if (Y == X && X == -23 || X == -23 && Y == 0 || X == 0 && Y == X) {
            Result.setText("На границе.");
        } else {
            Result.setText("Нет.");
        }
    }
}