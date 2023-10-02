import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        // Define the database URL, username, and password
        String jdbcUrl = "jdbc:mysql://localhost:3306/java";
        String username = "shiv";
        String password = "123";

        // Initialize the connection
        try {
            // Load the MySQL Connector/J driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Check if the connection is successful
            if (connection != null) {
                System.out.println("Connected to the database!");
                // Perform additional database operations here
                // For testing purposes, you can print a message or query the database
                // For example: connection.createStatement().executeQuery("SELECT * FROM your_table");
                // Don't forget to close the connection when done
                connection.close();
            } else {
                System.err.println("Failed to connect to the database!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
