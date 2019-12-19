package bp6.FXMLControllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.*;
import java.text.DateFormat;
import java.util.ResourceBundle;

public class BewegingsViewFXMLController implements Initializable {

    @FXML
    private AnchorPane bewegingAnchorPane;
    @FXML
    private RadioButton rdbDag, rdbWeek, rdbMaand;
    @FXML
    private Label lblBeweging;
    @FXML
    private BarChart<String, Integer> bewegingBarChart;


    private Connection connexion;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        String query="select Tijd from beweging order by Tijd";
        XYChart.Series<String, Integer> series = new XYChart.Series<>();

        try{
            try {
              connexion =   connectDB();
                ResultSet rs = connexion.createStatement().executeQuery(query);
                while (rs.next()){
                    series.getData().add(new XYChart.Data<>(rs.getString(1),rs.getInt(2)));


                }
                bewegingBarChart.getData().add(series);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private Connection connectDB() throws SQLException {
        String dbString="jdbc:mysql://localhost:3306/bp6?useSSL=false";
        Connection conn = DriverManager.getConnection(dbString, "root", "Stranger5709");
        System.out.println("Connection made");




        return conn;
    }

}
