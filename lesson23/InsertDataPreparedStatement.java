package lesson23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static lesson23.ConnectionData.PASSWORD;
import static lesson23.ConnectionData.URL;
import static lesson23.ConnectionData.USER;

public class InsertDataPreparedStatement {
    private static final String INSERT_QUERY =
            "INSERT INTO phones (phone_id, user_id, phone_number) VALUES (?,?,?);";

    public static void main(String[] args) {
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(INSERT_QUERY)) {

            preparedStatement.setInt(1, 5);
            preparedStatement.setInt(2, 1);
            preparedStatement.setString(3, "0856451237");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 6);
            preparedStatement.setInt(2, 3);
            preparedStatement.setString(3, "7894567812");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
