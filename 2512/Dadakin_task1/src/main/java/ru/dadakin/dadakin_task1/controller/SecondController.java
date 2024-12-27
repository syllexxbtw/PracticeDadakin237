package ru.dadakin.dadakin_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.dadakin.dadakin_task1.util.Manager.showSecondScene;

public class SecondController {

    @FXML
    private Button goButton;

    @FXML
    void goB(ActionEvent event) {
        showSecondScene("hello-view.fxml","Marathon Skills 2016");
    }

}
