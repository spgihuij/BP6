package bp6.FXMLControllers;

import bp6.Controllers.LichtViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginViewFXMLController implements Initializable {


    @FXML
    private Button btnLogin;
    @FXML
    private TextField txtLogin;
    @FXML
    private AnchorPane loginAnchorPane;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        txtLogin.setText("Vul hier u naam in");
    }

    @FXML
    public void loginButtonKlik(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();
        AnchorPane pane = fxmlLoader.load(getClass().getResource("/bp6/Resources/ContainerView.fxml").openStream());
        loginAnchorPane.getChildren().setAll(pane);
    }

}
