package bp6.controller;

import bp6.model.Lichtwaarde;

import java.sql.*;

public class DatabaseController {
    private final static String connectionUrl = "insert url here";
    private static final int arraySize = 20;
    //  sql queries
    private static final String getLichtwaardes = "SELECT * FROM lichtwaarde LIMIT 20";
    private Connection conn;

    public Lichtwaarde[] getLichtwaarde() {
        Lichtwaarde[] lichtwaardes = new Lichtwaarde[arraySize];
        //opening connection
        try {
            conn = DriverManager.getConnection(connectionUrl);

            try (Statement statement = conn.createStatement()) {
                ResultSet rs = statement.executeQuery(getLichtwaardes);

                // filling array
                ResultSetMetaData rsmetadata = rs.getMetaData();
                int columns = rsmetadata.getColumnCount();
                while (rs.next()) {
                    for (int j = 1; j < columns; j++) {
                        Lichtwaarde newLichtwaarde = new Lichtwaarde();
                        newLichtwaarde.setId(rs.getString("Ruimte_id"));
                        newLichtwaarde.setTijd(rs.getTime("Tijd"));
                        newLichtwaarde.setLuxBinnen(rs.getInt("LuxBinnen"));
                        newLichtwaarde.setLuxBuiten(rs.getInt("LuxBuiten"));
                        lichtwaardes[j] = newLichtwaarde;
                    }
                }
                rs.close();
                conn.close();

            } catch (SQLException e) {
                throw new Error("Error: ", e);
            }
        } catch (SQLException e) {
            throw new Error("Error: ", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return lichtwaardes;
    }
}
