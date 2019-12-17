package bp6.controller;

import bp6.model.LichtwaardeVerzameling;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.chart.LineChart;

public class LichtViewController {

    private Parent lichtView;
    private LichtwaardeVerzameling lichtwaardes;
    private DatabaseController dbController;
    private FXMLController control;
    private FXMLLoader fxmlLoader;


    private LineChart<Number, Number> lineChart;

    public LichtViewController(DatabaseController dbController) {
        this.dbController = dbController;
        control = new FXMLController();
        lichtwaardes = new LichtwaardeVerzameling(this.dbController);
        setLichtView();
        getFXMLControl();
        control.setVerbruikteEnergie("1.000");
    }

    private void setLichtView() {
        try {
            fxmlLoader = new FXMLLoader();
            lichtView = fxmlLoader.load(getClass().getResource("/bp6/resources/LichtView.fxml").openStream());
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public Parent getLichtView() {
        return lichtView;
    }

    public void getFXMLControl(){

        control = fxmlLoader.getController();
    }

}
