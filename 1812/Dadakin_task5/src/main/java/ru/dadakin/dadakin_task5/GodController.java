package ru.dadakin.dadakin_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GodController {

    @FXML
    private Label Result;

    @FXML
    private TextField godTextField;

    @FXML
    void godResOnAction(ActionEvent event) {
        int God = Integer.parseInt(godTextField.getText().toString());
        int Goda;
        if (God % 100 == 0) {
            Goda = God / 100;
        } else {
            Goda = God / 100 + 1;
        }
        Result.setText("Номер столетия: " + Goda);
    }

}
