package bp6.FXMLControllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class WeerViewFXMLController implements Initializable {

    @FXML
    private AnchorPane weerAnchorPane;
    @FXML
    private TableView weerTable;
    @FXML
    private TableColumn weerColumn1, weerColumn2, weerColumn3;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
