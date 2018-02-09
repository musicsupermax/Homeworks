package lesson14;

        import lesson10.ex1.Printable;

public class NewPrintableDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("This is lesson 14!");
            }
        };
        printable.print();
    }
}
