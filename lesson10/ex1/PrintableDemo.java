package lesson10.ex1;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable[] printables = new Printable[2];
        printables[0] = new Book("Hood");
        printables[1] = new Magazine("About dogs");

        Magazine.printMagazine(printables);
        Book.printBooks(printables);

        for (Printable printer : printables) {
            printer.print();
        }
    }
}
