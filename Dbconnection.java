/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Database connection utility class.
 * 
 * Provides methods to establish and close a connection to the database.
 * 
 * Author: Anabelle R. Baxinela
 */
public class Dbconnection {

    // Database connection parameters
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/library";
    private static final String USER = "root";
    private static final String PASSWORD = "1923";

    /**
     * Establishes a connection to the database.
     * 
     * @return a Connection object if successful, otherwise null.
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection Successful!");
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found: " + e.getMessage());
        }
        return connection;
    }

    /**
     * Closes the provided database connection.
     * 
     * @param connection the Connection object to be closed.
     */
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                System.out.println("Error closing the connection: " + e.getMessage());
            }
        }
    }
}
