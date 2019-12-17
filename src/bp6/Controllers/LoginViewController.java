package bp6.Controllers;

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
            loginView = FXMLLoader.load(getClass().getResource("/bp6/Resources/LoginView.fxml"));
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
