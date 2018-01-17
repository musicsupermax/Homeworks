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
        System.out.println(this.fullName + " takes " + quantity + " books");
    }

    void takeBook(String... title) {
        for (String tit : title) {
            System.out.println(this.fullName + " takes " + tit);
        }
    }

    void takeBook(Book... object) {
        for (Book ob : object) {
            System.out.println(this.fullName + " takes " + ob.name + " " + ob.author);
        }
    }

    void returnBook(int quantity) {
        System.out.println(this.fullName + " returns " + quantity + " books");
    }

    void returnBook(String... title) {
        for (String tit : title) {
            System.out.println(this.fullName + " returns " + tit);
        }
    }

    void returnBook(Book... object) {
        for (Book ob : object) {
            System.out.println(this.fullName + " returns " + ob.name + " " + ob.author);
        }
    }

    public static void main(String[] args) {
        LibUser[] user = new LibUser[3];

        user[0] = new LibUser("Harry Tort", "KM00002", "FT-16", "01.12.1995", "0956216547");
        user[1] = new LibUser("Karter Duke", "KM00123", "FN-25", "17.05.1998", "0731645175");
        user[2] = new LibUser("Gordon Umti", "KM00345", "TP-44", "25.10.2000", "0554231487");

        for (LibUser a : user) {
            System.out.println(a.fullName + " " + a.numbTicket + " " + a.faculty + " " + a.birthDate + " " + a.numbTelephone);
        }

        System.out.println();

        user[0].takeBook(4);
        user[1].takeBook("\"Alabama\"", "\"Dude\"");

        Book book = new Book("Gudson", "\"RipperPart\"");
        user[2].takeBook(book);

        System.out.println();

        user[0].returnBook(5);
        user[1].returnBook("\"Solitude\"", "\"Why?\"");
        user[2].returnBook(book);
    }
}
