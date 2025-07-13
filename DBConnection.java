/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Simran
 */
class DBConnection {
     private static final String URL = "jdbc:mysql://localhost:3306/cafe_billing";
    private static final String USER = "root"; // MySQL username
    private static final String PASSWORD = "simm"; // Your MySQL password (leave blank if none)

    // Method to get connection
    public static Connection getConnection() {
        Connection conn = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("✅ Connected to database successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Connection to database failed.");
            e.printStackTrace();
        }

        return conn;
    }
}

    

