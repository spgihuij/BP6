package bp6.FXMLControllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ContainerViewFXMLController implements Initializable {

    @FXML
    private AnchorPane containerAnchorPane, apMain;
    @FXML
    private MenuBar mbContainer;
    @FXML
    private Menu menuOptie1, menuOptie2, menuOptie3, menuOptie4;
    @FXML
    private MenuItem menuItem1, menuItem2, menuItem3, menuItem4;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FXMLLoader fxmlLoader = new FXMLLoader();
        AnchorPane pane = null;
        try {
            pane = fxmlLoader.load(getClass().getResource("/bp6/Resources/LichtView.fxml").openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        apMain.getChildren().setAll(pane);
    }



    @FXML
    public void klikMenuItem1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        AnchorPane pane = fxmlLoader.load(getClass().getResource("/bp6/Resources/LichtView.fxml").openStream());
        apMain.getChildren().setAll(pane);
    }

    @FXML
    public void klikMenuItem2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        AnchorPane pane = fxmlLoader.load(getClass().getResource("/bp6/Resources/WeerView.fxml").openStream());
        apMain.getChildren().setAll(pane);
    }

    @FXML
    public void klikMenuItem3(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        AnchorPane pane = fxmlLoader.load(getClass().getResource("/bp6/Resources/BewegingsView.fxml").openStream());
        apMain.getChildren().setAll(pane);
    }

    @FXML
    public void klikMenuItem4(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        AnchorPane pane = fxmlLoader.load(getClass().getResource("/bp6/Resources/LoginView.fxml").openStream());
        containerAnchorPane.getChildren().setAll(pane);
    }

}
