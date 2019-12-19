package bp6.FXMLControllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import javafx.scene.control.Label;
import java.net.URL;
import java.util.Random;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LichtViewFXMLController implements Initializable {

    @FXML
    private Label verbruikteEnergie;

    @FXML
    private LineChart lineChart;

    private Label verbruikteEnergie, zonderSysteem, verschil, kosten;
    @FXML
    private AnchorPane lichtAnchorPane;
  
    @FXML
    private Button btnVerstuur;

    private Connection connexion;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        verbruikteEnergie.setText("0");

    }

    public void setVerbruikteEnergie(String text) {
        verbruikteEnergie.setText(text);
    }

    public void setLineChart(XYChart.Series series) {

        lineChart.getData().add(series);

    /**
    @FXML
    public void btnVerstuurKlik (ActionEvent event){
        String query="INSERT INTO ruimte " ;// where ruimte id= ... set aantal lampen ....;

    }
*/


    private Connection connectDB() throws SQLException {
        String dbString="jdbc:mysql://localhost:3306/bp6?useSSL=false";
        Connection conn = DriverManager.getConnection(dbString, "root", "admin");
        System.out.println("Connection made");

        return conn;

    }
}
