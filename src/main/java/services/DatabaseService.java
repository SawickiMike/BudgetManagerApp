package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {
    private static final String URL = "jdbc:mysql://localhost:3306/BudgetManagerApp";
    private static final String USER = "Mike";
    private static final String PASSWORD = "0108";

    private Connection connection;

    public DatabaseService() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to connect to the database.");
        }
    }

    // Metoda do zamykania połączenia z bazą danych
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection to the database closed.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Failed to close connection to the database.");
            }
        }
    }
}
