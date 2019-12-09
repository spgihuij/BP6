package bp6.model;

import bp6.controller.DatabaseController;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class LichtwaardeVerzameling {

    private final NumberAxis xAxis = new NumberAxis();
    private final NumberAxis yAxis = new NumberAxis();

    private DatabaseController DBController;
    private LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

    public LichtwaardeVerzameling() {
        DBController = new DatabaseController();
        fillChart();
    }

    private void fillChart() {
        Lichtwaarde[] lichtwaardes = DBController.getLichtwaarde();
        XYChart.Series series = new XYChart.Series();
        series.setName("data");
        for (Lichtwaarde lichtwaarde : lichtwaardes) {
            series.getData().add(new XYChart.Data(lichtwaarde.getTijd(), lichtwaarde.getLuxBinnen()));
        }
        lineChart.getData().add(series);
    }
}
