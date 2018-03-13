package lesson23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static lesson23.ConnectionData.DB;
import static lesson23.ConnectionData.PASSWORD;
import static lesson23.ConnectionData.USER;

public class CreatingDataBase {
    private static final String CREATE_DATABASE_QUERY =
            "CREATE DATABASE IF NOT EXISTS " + DB;

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mysql",
                    //+ "?autoReconnect=true&useSSL=false"
                    USER, PASSWORD);
            statement = connection.createStatement();
            statement.executeUpdate(CREATE_DATABASE_QUERY);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
