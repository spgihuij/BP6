package bp6.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class LoginViewController {

    private Parent loginView;

    public LoginViewController(){
        setLoginView();
    }

    public void setLoginView(){
        try
        {
            loginView = FXMLLoader.load(getClass().getResource("/bp6/resources/LoginView.fxml"));
        }

        catch(Exception e)
        {
            System.out.println("error code: " + e);
        }
    }

    public Parent getLoginView() {
        return loginView;
    }
}
