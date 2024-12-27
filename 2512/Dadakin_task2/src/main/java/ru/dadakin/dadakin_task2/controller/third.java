package ru.dadakin.dadakin_task2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.dadakin.dadakin_task2.util.Manager.showSecondStage;

public class third {

    @FXML
    private Button BackB;

    @FXML
    private Button Cancel;

    @FXML
    void BackB(ActionEvent event) {
        showSecondStage("runner-view.fxml", "Marathon Skills 2016");

    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondStage("second.fxml", "Marathon Skills 2016 - Register as a runner");

    }

}
