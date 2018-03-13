package lesson23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static lesson23.ConnectionData.DRIVER;
import static lesson23.ConnectionData.PASSWORD;
import static lesson23.ConnectionData.URL;
import static lesson23.ConnectionData.USER;

public class RetrieveDataPreparedStatement {
    private static final String INSERT_QUERY =
            "SELECT * FROM users WHERE user_id>? AND username LIKE ?";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(INSERT_QUERY)) {

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "R%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.printf("%d%23s%n", resultSet.getInt("user_id"), resultSet.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
