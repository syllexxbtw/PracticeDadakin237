package ru.dadakin.dadakin_task2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class For2Controller {

    @FXML
    private Button Ok;

    @FXML
    private Label Result;

    @FXML
    private TextField Vvod;

    @FXML
    private Button addButton;

    @FXML
    private Button cancel;

    @FXML
    private ListView<Integer> dataList;

    @FXML
    void OkResOnAction(ActionEvent event) {
        List <Integer> data = dataList.getItems();
        int sum = 0;
        for (Integer n : data) {
            if (n % 6 == 0 && n % 10 == 4) {
                sum = sum + n;
            }
        }
        Result.setText(String.valueOf(sum));
    }

    @FXML
    void addOnAction(ActionEvent event) {
        if (Vvod.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(Vvod.getText().toString());
            dataList.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные. ");
            alert.showAndWait();
        }
        finally {
            Vvod.setText("");
        }
    }

    @FXML
    void btnResOnAction(ActionEvent event) {
        Platform.exit();
    }

}

