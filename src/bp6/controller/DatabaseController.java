package bp6.controller;

import bp6.model.Lichtwaarde;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseController {
    private final static String connectionUrl = "jdbc:mysql://localhost:3306/bp6?useSSL=false";
    //  sql queries
    private static final String getLichtwaardes = "SELECT * FROM lichtwaarde ORDER BY Tijd limit 20 ";
    private static final String getLastLichtwaarde = "SELECT * from lichtwaarde ORDER BY Tijd LIMIT 1";

    private Connection conn;

    public ArrayList<Lichtwaarde> getLichtwaarde() {

        ArrayList<Lichtwaarde> lichtwaardes = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(connectionUrl, "root", "Stranger5709");

            try (Statement statement = conn.createStatement()) {
                ResultSet rs = statement.executeQuery(getLichtwaardes);
                ResultSetMetaData rsmetadata = rs.getMetaData();
                int columns = rsmetadata.getColumnCount();

                int i = 0;
                while (rs.next() && i <= 20) {
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
}
