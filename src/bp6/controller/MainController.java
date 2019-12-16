package bp6.controller;

import javafx.scene.Parent;

public class MainController {

    public LichtViewController lichtViewController;
    private Parent root;

    public MainController() {
        lichtViewController = new LichtViewController();
        root = lichtViewController.getLichtView();
    }

    public Parent getLichtView() {
        return root;
    }
}
