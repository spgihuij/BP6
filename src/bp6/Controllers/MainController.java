package bp6.Controllers;

import javafx.scene.Parent;

public class MainController {

    private DatabaseController dbController;
    private LoginViewController loginViewController;
    private Parent root;

    public MainController() {
        dbController = new DatabaseController();
        loginViewController = new LoginViewController(this.dbController);
        root = loginViewController.getLoginView();
    }

    public Parent getRootView() {
        return root;
    }
}
