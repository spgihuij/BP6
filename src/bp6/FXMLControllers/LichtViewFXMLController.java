package bp6.FXMLControllers;

import bp6.Models.Lichtwaarde;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class LichtViewFXMLController implements Initializable {

    @FXML
    private Label verbruikteEnergie;

    @FXML
    private LineChart lineChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        verbruikteEnergie.setText("0");
    }

    public void setVerbruikteEnergie(String text) {
        verbruikteEnergie.setText(text);
    }

    public void setLineChart(XYChart.Series series) {

        lineChart.getData().add(series);
    }
}
