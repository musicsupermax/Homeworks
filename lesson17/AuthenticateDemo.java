package lesson17;

public class AuthenticateDemo {
    public static void main(String[] args) {
        System.out.println(isAuthenticated("login1", "password1",
                "password1"));
        System.out.println();
        System.out.println(isAuthenticated("loginasdasrrwerwersdfsdf2",
                "password2", "password2"));
        System.out.println();
        System.out.println(isAuthenticated("login3", "passasdqweqwesdfsdfword3",
                "passasdqweqwesdfsdfword3"));
        System.out.println();
        System.out.println(isAuthenticated("login4", "password4",
                "password5"));
        System.out.println();
        System.out.println("The End");
    }

    public static boolean isAuthenticated(String login, String password,
                                          String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Incorrect login input!");
            } else if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Incorrect password input!");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.printf("Login: %s\nPassword: %s\nConfirmPassword: %s\n",
                    login, password, confirmPassword);
        }
        return true;
    }
}
