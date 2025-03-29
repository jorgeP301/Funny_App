package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToQuestion() throws IOException {
        App.setRoot("question");
    }
}