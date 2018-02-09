package lesson14;

import static lesson14.User.createQuery;
import static lesson14.User3.createQueryNew;

public class UserDemo {
    public static void main(String[] args) {
        User user = new User("TOR", "tratratra");
        createQuery(user);

        User.Query query = user.new Query();
        query.printToLog();

        User.Query query1 = new User("Docker", "loploplop").new Query();
        query1.printToLog();

        User2 user2 = new User2("Tolly", "visvisvis");
        user2.createToLog();

        User3 user3 = new User3();
        user3.setLogin("Torut");
        user3.setPassword("ammaamma");
        createQueryNew(user3);
    }
}
