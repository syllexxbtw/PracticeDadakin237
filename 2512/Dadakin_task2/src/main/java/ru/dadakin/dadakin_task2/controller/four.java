package ru.dadakin.dadakin_task2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.dadakin.dadakin_task2.util.Manager.showSecondStage;

public class four {

    @FXML
    private Button backButton;

    @FXML
    private Button Cancel;

    @FXML
    private Button register;

    @FXML
    private Button logoutButton;

    @FXML
    void backButton(ActionEvent event) {
        showSecondStage("runner-view.fxml", "Marathon Skills 2016");

    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondStage("second.fxml", "Marathon Skills 2016 - Register as a runner");

    }

    @FXML
    void reg(ActionEvent event) {
        showSecondStage("five.fxml", "Marathon Skills 2016 – Register for an event");

    }

    @FXML
    void logButtonOnAction(ActionEvent event) {

        showSecondStage("runner-view.fxml", "Marathon Skills 2016");
    }
}
