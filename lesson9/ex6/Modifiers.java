package lesson9.ex6;

public class Modifiers {
    private String password;
    double price;
    protected String name;
    public int userId;

    public Modifiers(String password, double price, String name, int userId) {
        this.password = password;
        this.price = price;
        this.name = name;
        this.userId = userId;
    }

    public Modifiers() {
    }

    public static void main(String[] args) {
        Modifiers modifiers = new Modifiers();

        modifiers.password = "0000";
        modifiers.userId = 2;
        modifiers.price = 44.5;
        modifiers.name = "Serg";
    }
}
