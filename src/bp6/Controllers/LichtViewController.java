package bp6.Controllers;

import bp6.FXMLControllers.LichtViewFXMLController;
import bp6.Models.Lichtwaarde;
import bp6.Models.LichtwaardeVerzameling;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.chart.XYChart;

import java.util.ArrayList;

public class LichtViewController {

    private Parent lichtView;
    private LichtwaardeVerzameling lichtwaardeVerzameling;
    private DatabaseController dbController;
    private LichtViewFXMLController control;
    private FXMLLoader fxmlLoader;
    private XYChart.Series lichtWaardeSeries;
    private ArrayList<Lichtwaarde> lichtwaardes;

    public LichtViewController(DatabaseController dbController) {
        this.dbController = dbController;
        control = new LichtViewFXMLController();
        lichtwaardeVerzameling = new LichtwaardeVerzameling(this.dbController);
        lichtWaardeSeries = lichtwaardeVerzameling.getLichtwaardes();
        setLichtView();
        getFXMLControl();
        control.setLineChart(lichtWaardeSeries);
    }

    private void setLichtView() {
        try {
            fxmlLoader = new FXMLLoader();
            lichtView = fxmlLoader.load(getClass().getResource("/bp6/Resources/LichtView.fxml").openStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Parent getLichtView() {
        return lichtView;
    }

    public void getFXMLControl() {

        control = fxmlLoader.getController();
    }

    private void createLichtWaardeSeries(XYChart.Series lichtwaarden) {

        control.setLineChart(lichtwaarden);

    }

}
