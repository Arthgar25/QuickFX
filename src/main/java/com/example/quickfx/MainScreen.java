package com.example.quickfx;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public abstract class MainScreen extends BorderPane {
    public MainScreen() {
        this.setStyle("-fx-background-color: white;");

        this.setTop(buildNavBar());
        this.setLeft(buildSideBar());
        buildUI();
    }
    protected abstract void buildUI();

    private Node buildNavBar() {
        NavBar navBar = new NavBar("Atlas");
        return navBar;
    }

    private Node buildSideBar() {
        SideBar sideBar = new SideBar();
        return sideBar;
    }


}
