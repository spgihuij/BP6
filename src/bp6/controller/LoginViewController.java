package bp6.controller;

import bp6.view.LoginView;
import javafx.scene.layout.Pane;

public class LoginViewController {

    private Pane pane;

    public LoginViewController(Pane pane){
        this.pane = pane;
        createView(this.pane);
        createConnection(this.databaseController);
    }

    public void createView(Pane pane){

        LoginView loginView = new LoginView();
        pane.getChildren().add(loginView);

    }

    public void createConnection(DatabaseController databaseController){}
    DatabaseController databaseController = new DatabaseController();


}
