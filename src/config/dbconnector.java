
package config;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;

public class dbconnector {
  
 private Connection connect; 
    
    public dbconnector(){
    try {
        // Ensure the URL, username, and password are correct
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3307/tuah", "root", "");
        System.out.println("Connected to the database.");
    } catch (SQLException ex) {
        System.out.println("Failed to connect to the database:");
        ex.printStackTrace();
    }
}
    
    // Function to retrieve data
    public ResultSet getData(String sql) throws SQLException {
        Statement stmt = connect.createStatement();
        ResultSet rst = stmt.executeQuery(sql);
        return rst;
    }
    
    // Getter for the connection object
    public Connection getConnection() {
        return connect;
    }
    
  // Function to save data using PreparedStatement
public boolean insertData(String sql, String... params) {
    try {
        PreparedStatement pst = connect.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            pst.setString(i + 1, params[i]);
        }
        pst.executeUpdate();
        System.out.println("Inserted Successfully!");
        pst.close();
        return true;
    } catch (SQLException ex) {
        System.out.println("Connection Error8: " + ex);
        return false;
    }
}

// Function to check if an email or username already exists
public boolean isDuplicate(String email, String username) {
    try {
        String query = "SELECT * FROM tbl_user WHERE u_email = ? OR u_username = ?";
        PreparedStatement pstmt = connect.prepareStatement(query);
        pstmt.setString(1, email);
        pstmt.setString(2, username);
        ResultSet resultSet = pstmt.executeQuery();

        // If a record is found, it means the email or username is already in use
        return resultSet.next();
    } catch (SQLException ex) {
        System.out.println("Error checking for duplicates: " + ex.getMessage());
        return false;
    }
}
 //Function to update data
       
     public boolean isDuplicate(String email, String username, String userId) {
    try {
        String query = "SELECT * FROM tbl_user WHERE (u_email = ? OR u_username = ?) AND u_id != ?";
        PreparedStatement pstmt = connect.prepareStatement(query);
        pstmt.setString(1, email);
        pstmt.setString(2, username);
        pstmt.setString(3, userId);
        ResultSet resultSet = pstmt.executeQuery();

        // If a record is found, it means the email or username is already in use
        return resultSet.next();
    } catch (SQLException ex) {
        System.out.println("Error checking for duplicates: " + ex.getMessage());
        return false;
    }

        
        }   

   public boolean updateData(String sql, Object... params) {
    try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
        for (int i = 0; i < params.length; i++) {
            pstmt.setObject(i + 1, params[i]);
        }
        int rowsAffected = pstmt.executeUpdate();
        return rowsAffected > 0;
    } catch (SQLException ex) {
        System.out.println("Error updating data: " + ex.getMessage());
        return false;
    }
}
    public boolean deleteData(String query, String userId) {
    Connection conn = null;
    PreparedStatement pstmt = null;
    try {
        conn = getConnection();
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, userId);

        // Execute the delete
        int rowsAffected = pstmt.executeUpdate();
        return rowsAffected > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}
