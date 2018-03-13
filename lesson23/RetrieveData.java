package lesson23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static lesson23.ConnectionData.DRIVER;
import static lesson23.ConnectionData.PASSWORD;
import static lesson23.ConnectionData.USER;
import static lesson23.ConnectionData.URL;

public class RetrieveData {
    private static final String SELECT_QUERY = "SELECT * FROM phones;";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DRIVER);
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
            System.out.printf("%-20s%-10s%s%n", "phone_id", "user_id", "phone_number");
            System.out.println("-------------------------------");
            while (resultSet.next()) {
                int phoneId = resultSet.getInt("phone_id");
                int userId = resultSet.getInt("user_id");
                String phoneNumber = resultSet.getString("phone_number");
                System.out.printf("%-23s%-7s%s%n", phoneId, userId, phoneNumber);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
