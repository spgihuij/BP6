package bp6.controller;

import javafx.scene.layout.Pane;

public class MainController {
    public Pane mainPane;
    private LoginViewController loginController;

    public MainController() {
        mainPane = new Pane();
    }

    public void login() {
        loginController = new LoginViewController(mainPane);

    }

}
