package bp6.Controllers;


import javafx.scene.chart.XYChart;
import java.sql.*;

public class DatabaseController {
    private final static String connectionUrl = "jdbc:mysql://localhost:3306/bp6?useSSL=false";
    //  sql queries
    private static final String getLichtwaarden = "SELECT Tijd, Luxbinnen FROM lichtwaarde ORDER BY Tijd ASC LIMIT 20;";

    private Connection conn;

    public XYChart.Series getLichtwaarden() {

        XYChart.Series<String, Integer> lichtwaardeSeries = new XYChart.Series<>();

        try {
            conn = DriverManager.getConnection(connectionUrl, "root", "Stranger5709");
            try (Statement statement = conn.createStatement()) {
                ResultSet rs = statement.executeQuery(getLichtwaarden);

                    while (rs.next()){
                        System.out.println("datetime|"+rs.getString(1) + "|lux|" +  rs.getInt(2));
                        lichtwaardeSeries.getData().add(new XYChart.Data<>(rs.getString(1),rs.getInt(2)));
                    }
                rs.close();
                conn.close();

            } catch (SQLException e) {
                throw new Error("Error: ", e);
            }
        } catch (SQLException e) {
            throw new Error("Error: ", e);
        }
        return lichtwaardeSeries;
    }
}
