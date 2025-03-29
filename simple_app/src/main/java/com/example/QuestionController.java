package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class QuestionController {

    @FXML
    private void switchToStart() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void switchToFail() throws IOException {
        App.setRoot("fail");
    }
}
