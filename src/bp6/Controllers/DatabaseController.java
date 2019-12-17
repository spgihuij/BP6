package bp6.Controllers;

import bp6.Models.Gebruiker;
import bp6.Models.Lichtwaarde;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseController {

    private Connection conn;
    private final static String connectionUrl = "jdbc:mysql://localhost:3306/bp6?useSSL=false";
    //SQL Queries
    private static final String getLichtwaardes = "SELECT * FROM lichtwaarde ORDER BY Tijd limit 20 ";
    private static final String getGebruikers = "SELECT * FROM gebruiker";
    private static final String getLastLichtwaarde = "SELECT * from lichtwaarde ORDER BY Tijd LIMIT 1";





    /**
     * Lichtwaarde arraylist vullen
     *
     *
     *
     *
     */

    public ArrayList<Lichtwaarde> getLichtwaarde() {

        ArrayList<Lichtwaarde> lichtwaardes = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(connectionUrl, "root", "admin");

            try (Statement statement = conn.createStatement()) {
                ResultSet rs = statement.executeQuery(getLichtwaardes);
                ResultSetMetaData rsmetadata = rs.getMetaData();
                int columns = rsmetadata.getColumnCount();

                int i = 0;
                while (rs.next() && i <= columns) {
                    Lichtwaarde newLichtwaarde = new Lichtwaarde();
                    newLichtwaarde.setId(rs.getString("Ruimte_id"));
                    newLichtwaarde.setTijd(rs.getTime("Tijd"));
                    newLichtwaarde.setLuxBinnen(rs.getInt("LuxBinnen"));
                    newLichtwaarde.setLuxBuiten(rs.getInt("LuxBuiten"));
                    System.out.println("id " + newLichtwaarde.getId() + " |luxbinnen| " + newLichtwaarde.getLuxBinnen() + " |tijd| " + newLichtwaarde.getTijd());
                    lichtwaardes.add(newLichtwaarde);
                    i++;
                }
                System.out.println("exit while");
                rs.close();
                conn.close();

            } catch (SQLException e) {
                throw new Error("Error: ", e);
            }
        } catch (SQLException e) {
            throw new Error("Error: ", e);
        }
        return lichtwaardes;
    }





    /**
     * Gebruikers arraylist vullen
     *
     *
     *
     *
     */


    public ArrayList<Gebruiker> getGebruikers() {

        ArrayList<Gebruiker> gebruikers = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(connectionUrl, "root", "admin");

            try (Statement statement = conn.createStatement()) {
                ResultSet rsGebruikers = statement.executeQuery(getGebruikers);
                ResultSetMetaData rsmetadataGebruikers = rsGebruikers.getMetaData();

                int columns = rsmetadataGebruikers.getColumnCount();

                int i = 0;
                while (rsGebruikers.next() && i <= columns) {

                    int gebruiker_id = rsGebruikers.getInt("id");
                    String gebruiker_naam = rsGebruikers.getString("naam");
                    Gebruiker newGebruiker = new Gebruiker(gebruiker_id,gebruiker_naam);

                    System.out.println("Naam: " + newGebruiker.getNaam());
                    gebruikers.add(newGebruiker);
                    i++;
                }
                System.out.println("exit while");
                rsGebruikers.close();
                conn.close();

            } catch (SQLException e) {
                throw new Error("Error: ", e);
            }
        } catch (SQLException e) {
            throw new Error("Error: ", e);
        }
        return gebruikers;
    }






}
