package bp6.FXMLControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
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
    private Label verbruikteEnergie, zonderSysteem, verschil, kosten;
    @FXML
    private AnchorPane lichtAnchorPane;
    @FXML
    private LineChart lichtLineChart;
    @FXML
    private Button btnVerstuur;

    private Connection connexion;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        verbruikteEnergie.setText("0");
        String query="select Tijd, Luxbinnen from lichtwaarde order by tijd asc";
        XYChart.Series<String, Integer> series = new XYChart.Series<>();

        try{
            try {
                connexion =   connectDB();
                ResultSet rs = connexion.createStatement().executeQuery(query);
                while (rs.next()){
                    series.getData().add(new XYChart.Data<>(rs.getString(1),rs.getInt(2)));
                    System.out.println("datetime|"+rs.getString(1) + "|lux|" +  rs.getInt(2));

                }
                lichtLineChart.getData().add(series);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void setVerbruikteEnergie(String text) {
        verbruikteEnergie.setText(text);
    }


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
