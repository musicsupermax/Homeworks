package lesson23;

public class PhoneDaoMain {
    public static void main(String[] args) {
        PhoneDAO phoneDAO = new PhoneDAO();
        System.out.println(phoneDAO.findAll());
        System.out.println(phoneDAO.findEntityById(2));
    }
}
