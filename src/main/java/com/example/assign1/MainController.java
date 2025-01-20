package com.example.assign1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label alertText;

    @FXML
    protected void onPrevButtonClick() {
        alertText.setText("You have clicked \"Previous!\"");
    }

    @FXML
    protected void onNextButtonClick() {
        alertText.setText("You have clicked \"Next!\"");
    }

    @FXML
    protected void onCancelButtonClick() {
        alertText.setText("You have clicked \"Cancel!\"");
    }

    @FXML
    protected void onHelpButtonClick() {
        alertText.setText("You have clicked \"Help!\"");
    }

    @FXML
    protected void onExitButtonClick() {
        alertText.setText("You have clicked \"Exit!\"");
    }

    @FXML
    protected void onStopButtonClick() {
        alertText.setText("You have clicked \"Stop!\"");
    }
}