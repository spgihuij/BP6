package bp6.Controllers;

import bp6.FXMLControllers.LoginViewFXMLController;
import bp6.Models.Gebruiker;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class LoginViewController {
    private DatabaseController dbController;
    private LoginViewFXMLController controlFXML;
    private FXMLLoader fxmlLoader;
    private Parent loginView;
    private String[] usernames;



    public LoginViewController(DatabaseController dbController) {
        this.dbController = dbController;
        controlFXML = new LoginViewFXMLController();
        setLoginView();
        getFXMLControl();


    }

    public void setLoginView() {
        try {
            fxmlLoader = new FXMLLoader();
            loginView = fxmlLoader.load(getClass().getResource("/bp6/Resources/LoginView.fxml").openStream());

        } catch (Exception e) {
            System.out.println("error code: " + e);
        }
    }

    public Parent getLoginView() {
        return loginView;
    }

    public void getFXMLControl() {

        controlFXML = fxmlLoader.getController();
    }





}
