package lesson7;

public class LibUser {
    String fullName;
    String numbTicket;
    String faculty;
    String birthDate;
    String numbTelephone;

    public LibUser(String fullName, String numbTicket, String faculty, String birthDate, String numbTelephone) {
        this.fullName = fullName;
        this.numbTicket = numbTicket;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.numbTelephone = numbTelephone;
    }

    void takeBook(int quantity) {
    }

    void takeBook(String... title) {
    }

    void takeBook(Book... ob) {
    }

    void returnBook(int quantity) {
    }

    void returnBook(String... title) {
    }

    void returnBook(Book... ob) {
    }

    public static void main(String[] args) {
        LibUser[] user = new LibUser[3];

        user[0] = new LibUser("Harry Tort", "KM00002", "FT-16", "01.12.1995", "0956216547");
        user[1] = new LibUser("Karter Duke", "KM00123", "FN-25", "17.05.1998", "0731645175");
        user[2] = new LibUser("Gordon Umti", "KM00345", "TP-44", "25.10.2000", "0554231487");

        for (LibUser a : user) {
            System.out.println(a.fullName + " " + a.numbTicket + " " + a.faculty + " " + a.birthDate + " " + a.numbTelephone);
        }
    }
}
