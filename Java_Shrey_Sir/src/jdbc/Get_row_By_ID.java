package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class Get_row_By_ID {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        try {
            conn = Connections.getconnection();

            System.out.print("Enter salesman Id you want to find: ");
            int salesman_id = sc.nextInt();

            String query = "SELECT * FROM salesman WHERE salesman_id = ?";
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, salesman_id);

            rs = stmt.executeQuery(); // Use executeQuery() for SELECT statements

            if (rs.next()) { // Check if data is available
                System.out.println("Salesman ID: " + rs.getInt("salesman_id"));
                System.out.println("First_Name: " + rs.getString("first_name"));
                System.out.println("Last_Name: " +  rs.getString("last_name"));
                System.out.println("Salary: " + rs.getDouble("salary"));
                System.out.println("Car_Sales/Month: " + rs.getInt("car_sales_per_month"));
                System.out.println("Car Model: " +  rs.getString("car_model_sold"));
                System.out.println("Commission: " +  rs.getFloat("commission"));
                System.out.println("Hire_date: " +  rs.getDate("hire_date"));


            } else {
                System.out.println("No salesman found with ID: " + salesman_id);
            }
        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                sc.close(); // Close Scanner
            } catch (SQLException e) {
                System.out.println("Exception occurred while closing resources: " + e.getMessage());
            }
        }
    }
}
