package bp6.FXMLControllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ContainerViewFXMLController implements Initializable {

    @FXML
    private AnchorPane containerAnchorPane;
    @FXML
    private MenuBar mbContainer;
    @FXML
    private Menu menuOptie1, menuOptie2, menuOptie3, menuOptie4;
    @FXML
    private MenuItem menuItem1, menuItem2, menuItem3, menuItem4;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void setVerbruikteEnergie(String text) {

    }

}
