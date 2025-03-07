package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
    private static final String URL = "jdbc:mysql://localhost:3306/octjava";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getconnection() throws SQLException{
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }

    public static void main(String[] args) {
        try {
            System.out.println(getconnection());
        }catch (SQLException e){
            System.out.println("Exception Occured: " + e.getMessage());
        }
    }
}
