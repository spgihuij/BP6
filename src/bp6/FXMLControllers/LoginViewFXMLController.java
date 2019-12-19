package bp6.FXMLControllers;

import bp6.Controllers.LichtViewController;
import bp6.Models.Gebruiker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
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

        txtLogin.setText("");
    }

    @FXML
    public void loginButtonKlik(ActionEvent event) throws IOException {
        Gebruiker g1 = new Gebruiker(1, "AvansDB");
        Gebruiker g2 = new Gebruiker(2, "FontysTIL");
        Gebruiker g3 = new Gebruiker(3, "NHTVBREDA");
        Gebruiker g4 = new Gebruiker(4, "Admin");

        if (txtLogin.getText().contains(g1.getNaam()) || txtLogin.getText().contains(g2.getNaam()) || txtLogin.getText().contains(g3.getNaam()) || txtLogin.getText().contains(g4.getNaam())) {
            FXMLLoader fxmlLoader = new FXMLLoader();
            AnchorPane pane = fxmlLoader.load(getClass().getResource("/bp6/Resources/ContainerView.fxml").openStream());
            loginAnchorPane.getChildren().setAll(pane);

            System.out.println("Ingelogd als: " + txtLogin.getText());
        }
        else {

            JOptionPane.showMessageDialog(null, "Inlognaam: " + txtLogin.getText() + " is niet bekend. \n U vindt de inlognaam in de email van BP6@gmail.com. \n (Let op de hoofdletters)", "Verkeerde Login", JOptionPane.ERROR_MESSAGE);

        }




    }

}
