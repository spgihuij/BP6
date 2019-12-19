package bp6.FXMLControllers;

import bp6.Models.Lichtwaarde;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LichtViewFXMLController implements Initializable {

    private ArrayList<Lichtwaarde> lichtwaarden;

    private final static String connectionUrl = "jdbc:mysql://localhost:3306/bp6?useSSL=false";
    //SQL Queries
    private static final String getLichtwaarden = "SELECT Tijd, Luxbinnen, Luxbuiten FROM lichtwaarde ORDER BY Tijd ASC LIMIT 20";

    @FXML
    private Label verbruikteEnergie;

    @FXML
    private LineChart lineChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        verbruikteEnergie.setText("0");

        lichtwaarden = new ArrayList<>();

        try

        {
            conn = DriverManager.getConnection(connectionUrl, "root", "Stranger5709");
            try (Statement statement = conn.createStatement()) {
                ResultSet rs = statement.executeQuery(getLichtwaarden);

                while (rs.next()) {

                    Lichtwaarde newLichtwaarde = new Lichtwaarde(rs.getString(1), rs.getInt(2), rs.getInt(3));
                    lichtwaarden.add(newLichtwaarde);
                }
                rs.close();
                conn.close();

                XYChart.Series<Integer, String> lichtwaardenSeries = new XYChart.Series();

                for (Lichtwaarde l : lichtwaarden) {
                    lichtwaardenSeries.getData().add(new XYChart.Data(l.getTijd(), l.getLuxBinnen()));
                    lichtwaardenSeries.setName("Lux binnen");
                }

                lineChart.getData().add(lichtwaardenSeries);

            } catch (SQLException e) {
                throw new Error("Error: " + e);
            }
        } catch (Exception e){

        }
    }

    public void setVerbruikteEnergie(String text) {
        verbruikteEnergie.setText(text);
    }
}
