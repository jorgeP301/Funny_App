package com.example;

import javafx.fxml.FXML;
import java.io.IOException;

public class FailController {
    @FXML
    private void switchToStart() throws IOException {
        App.setRoot("primary");
    }
}
