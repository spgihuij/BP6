package bp6.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseController {

    public DatabaseController(){

    }

    private Connection createConnection(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String strConnectionString = "jdbc:mysql://localhost:3306/admin";
            conn = DriverManager.getConnection(strConnectionString,"admin","admin");

        } catch(Exception e){
            System.err.println(e.getMessage());
        }
        return conn;
    }

    public ResultSet getData(String strSQL){
        ResultSet result = null;
        try{
            Statement stmt = createConnection().createStatement();
            result = stmt.executeQuery(strSQL);
        }catch(Exception e){

        }
        return result;
    }
}
