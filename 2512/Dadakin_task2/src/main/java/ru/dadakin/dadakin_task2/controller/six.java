package ru.dadakin.dadakin_task2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.dadakin.dadakin_task2.util.Manager.showSecondStage;


public class six {

    @FXML
    private Button okButton;
    @FXML
    private Button backButton;

    @FXML
    private Button logoutButton;

    @FXML
    void backButton(ActionEvent event) {
        showSecondStage("runner-view.fxml", "Marathon Skills 2016");

    }

    @FXML
    void okButton(ActionEvent event) {

        showSecondStage("seven.fxml", "Marathon Skills 2016 - Runner menu");
    }

    @FXML
    void logButtonOnAction(ActionEvent event) {

        showSecondStage("runner-view.fxml", "Marathon Skills 2016");
    }
}
