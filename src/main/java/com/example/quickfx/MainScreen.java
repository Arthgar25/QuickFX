package com.example.quickfx;

import javafx.scene.layout.BorderPane;

public abstract class MainScreen extends BorderPane {
    public MainScreen() {
        this.setStyle("-fx-background-color: white;");
        buildUI();
    }
    protected abstract void buildUI();
}
