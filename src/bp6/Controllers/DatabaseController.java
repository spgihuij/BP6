package bp6.Controllers;

import bp6.Models.Lichtwaarde;
import javafx.scene.chart.XYChart;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseController {

    private final static String connectionUrl = "jdbc:mysql://localhost:3306/bp6?useSSL=false";
    //SQL Queries
    private static final String getLichtwaarde = "SELECT Tijd, Luxbinnen, luxBuiten FROM lichtwaarde ORDER BY Tijd ASC LIMIT 1;";
    private static final String getLichtwaarden = "SELECT Tijd, Luxbinnen, luxBuiten FROM lichtwaarde ORDER BY Tijd ASC LIMIT 20;";
    private static final String getGebruikers = "SELECT * FROM gebruiker";
    private static final String getLastLichtwaarde = "SELECT * from lichtwaarde ORDER BY Tijd LIMIT 1";
    private Connection conn;

    /**
     * Lichtwaarde arraylist vullen
     */

    public ArrayList<Lichtwaarde> getLichtwaarden() {

        ArrayList<Lichtwaarde> lichtwaardes = new ArrayList<>();

        try {

            conn = DriverManager.getConnection(connectionUrl, "root", "Stranger5709");
            try (Statement statement = conn.createStatement()) {
                ResultSet rs = statement.executeQuery(getLichtwaarden);

                while (rs.next()) {

                    Lichtwaarde newLichtwaarde = new Lichtwaarde(rs.getString(1), rs.getInt(2), rs.getInt(3));
                    lichtwaardes.add(newLichtwaarde);
                }
                rs.close();
                conn.close();

                // servi      conn = DriverManager.getConnection(connectionUrl, "root", "admin");

            } catch (SQLException e) {
                throw new Error("Error: " + e);
            }
        } catch (SQLException e) {
            throw new Error("Error: " + e);
        }
        return lichtwaardes;
    }

    public Lichtwaarde getLichtwaarde() {

        try {
            conn = DriverManager.getConnection(connectionUrl, "root", "Stranger5709");
            try (Statement statement = conn.createStatement()) {
                ResultSet rs = statement.executeQuery(getLichtwaarde);
                conn.close();

                Lichtwaarde newLichtwaarde = new Lichtwaarde(rs.getString(1), rs.getInt(2), rs.getInt(3));
                return newLichtwaarde;

            } catch (SQLException e) {
                throw new Error("Error: " + e);
            }
        } catch (SQLException e) {
            throw new Error("Error: " + e);
        }
    }

}
