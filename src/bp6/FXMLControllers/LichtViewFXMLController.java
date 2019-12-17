package bp6.FXMLControllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LichtViewFXMLController implements Initializable {

    @FXML
    private Label verbruikteEnergie, zonderSysteem, verschil, kosten;
    @FXML
    private AnchorPane lichtAnchorPane;
    @FXML
    private LineChart lichtLineChart;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        verbruikteEnergie.setText("0");
    }

    public void setVerbruikteEnergie(String text) {
        verbruikteEnergie.setText(text);
    }

}
