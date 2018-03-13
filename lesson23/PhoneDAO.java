package lesson23;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneDAO {
    public static final String SQL_SELECT_ALL_USERS = "SELECT * FROM phones";
    public static final String SQL_SELECT_USER_ID =
            "SELECT * FROM phones WHERE phone_id=?";

    public List<Phone> findAll() {
        List<Phone> phones = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_USERS);
            while (rs.next()) {
                int phone_id = rs.getInt(1);
                int user_id = rs.getInt(2);
                String phone_number = rs.getString(3);
                phones.add(new Phone(phone_id, user_id, phone_number));
            }
        } catch (SQLException e) {
            System.err.println("SQL Exeption (request or table failed):" + e);
        }
        return phones;
    }

    public Phone findEntityById(Integer id) {
        Phone phone = null;
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(SQL_SELECT_USER_ID)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                int phone_id = rs.getInt(1);
                int user_id = rs.getInt(2);
                String phone_number = rs.getString(3);
                phone = new Phone(phone_id, user_id, phone_number);
            }
        } catch (SQLException e) {
            System.err.println("SQL Exeption (request or table failed):" + e);
        }
        return phone;
    }
}
