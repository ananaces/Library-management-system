/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.sql.Connection;

/**
 *
 * @author anabelle R baxinela
 */
public class main {
    public static void main(String[] args) {
        // Get a connection from Dbconnection
        Connection conn = Dbconnection.getConnection();

        if (conn != null) {
            System.out.println("Database connection established successfully.");

            // Close the connection after testing
            Dbconnection.closeConnection(conn);
        } else {
            System.out.println("Failed to establish a database connection.");
        }
    }
}

    

