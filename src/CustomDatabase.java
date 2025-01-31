import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomDatabase {
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/";  // MySQL URL
    static final String USER = "root";  // Change to your MySQL username
    static final String PASSWORD = "Alaminhossainrifat@015";  // Change to your MySQL password 


    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        String databaseName = "CustomDatabase";  // Change your custom database name

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            System.out.println("Connected to MySQL server successfully!");

            statement = connection.createStatement();

            String sql = "CREATE DATABASE " + databaseName;
            statement.executeUpdate(sql);
            System.out.println("Database '" + databaseName + "' created successfully!");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found! " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error connecting to MySQL: " + e.getMessage());
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
