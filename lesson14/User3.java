package lesson14;

public class User3 {
    private static String login, password;

    public User3() {
    }

    public static class Query {
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

    public static void createQueryNew(User3 user) {
        Query query = new Query();
        query.printToLog();
    }
}
