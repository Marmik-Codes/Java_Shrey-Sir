package jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter salesman id to delete: ");
        int salesman_id = sc.nextInt();

        try {
            conn = Connections.getconnection();
            String query = "DELETE FROM salesman WHERE salesman_id  = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, salesman_id);

            int ra  = pstmt.executeUpdate();
            if (ra > 0) {
                System.out.println("Data deleted Successfully!");
            } else {
                System.out.println("Failed to delete data.");
            }
        }catch (Exception e){
            System.out.println("Exception Occured: " + e.getMessage());
        }finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
                sc.close();
            } catch (SQLException e) {
                System.out.println("Exception occurred while closing the objects: " + e.getMessage());
            }
        }
    }
}
