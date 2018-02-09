package lesson14;

public class User2 {
    private String login, password;

    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User2() {
    }

    public void createToLog() {
        class Query {
            public void printToLog() {
                System.out.printf("Пользователь с логином %s и паролем %s " +
                        "отправил запрос!%n", login, password);
            }
        }
        Query query = new Query();
        query.printToLog();
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
}