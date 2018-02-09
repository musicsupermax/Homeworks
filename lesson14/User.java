package lesson14;

public class User {
    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public class Query {
        public void printToLog() {
            System.out.printf("Пользователь с логином %s и паролем %s " +
                    "отправил запрос!%n", login, password);
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void createQuery(User user) {
        User.Query query = user.new Query();
        query.printToLog();
    }
}
