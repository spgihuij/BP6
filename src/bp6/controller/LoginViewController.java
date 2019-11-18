package bp6.controller;

import bp6.view.LoginView;
import javafx.scene.layout.Pane;

public class LoginViewController {

    private Pane pane;

    public LoginViewController(Pane pane){
        this.pane = pane;
        createView(this.pane);
    }

    public void createView(Pane pane){

        LoginView loginView = new LoginView();
        pane.getChildren().add(loginView);

    }

}
