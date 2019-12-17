package bp6.FXMLControllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class BewegingsViewFXMLController implements Initializable {

    @FXML
    private AnchorPane bewegingAnchorPane;
    @FXML
    private RadioButton rdbDag, rdbWeek, rdbMaand;
    @FXML
    private Label lblBeweging;
    @FXML
    private BarChart bewegingBarChart;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
     //Hier kun je dingen initializen
    }


}
