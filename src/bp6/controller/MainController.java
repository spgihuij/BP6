package bp6.controller;

import javafx.scene.Parent;

public class MainController {

    private DatabaseController dbController;
    private LichtViewController lichtViewController;
    private Parent root;

    public MainController() {
        dbController = new DatabaseController();
        lichtViewController = new LichtViewController(this.dbController);
        root = lichtViewController.getLichtView();
    }

    public Parent getLichtView() {
        return root;
    }
}
