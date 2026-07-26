package com.example.quickfx;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

public class SideBar extends VBox {
//    private final Label label;
    private final QuickButton open;
    private final QuickButton close;

    public SideBar() {
        // VBox setup
        this.setAlignment(Pos.CENTER_LEFT);
        this.setSpacing(15);
        this.setStyle("-fx-background-color: #252526; -fx-padding: 10px 20px; -fx-border-color: #333333; -fx-border-width: 0 0 1 0;");

        this.open = new QuickButton("Open") {
            @Override
            protected void addAction() {

            }
        };
        this.close = new QuickButton("Close") {
            @Override
            protected void addAction() {

            }
        };

        this.getChildren().addAll(open, close);

    }
}
