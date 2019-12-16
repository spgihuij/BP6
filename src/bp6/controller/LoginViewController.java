package bp6.controller;


import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginViewController implements Initializable {

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
