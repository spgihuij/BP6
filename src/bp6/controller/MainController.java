package bp6.controller;

import javafx.scene.Parent;

public class MainController {

    private LichtViewController lichtViewController;

    public MainController() {
        lichtViewController = new LichtViewController();
    }

    public Parent openLichtViewWindow() {
        return lichtViewController.getLichtView();
    }
}
