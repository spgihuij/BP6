package bp6.controller;


import javafx.scene.Parent;



public class MainController {

    public LoginViewController loginViewController;
    private Parent root;




    public MainController() {



        loginViewController = new LoginViewController();
        root = loginViewController.getLoginView();

    }

public Parent getLoginView() {
return root;
}



}


