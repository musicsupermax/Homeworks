package lesson8.ex4;

public class Violet extends Flower {
    private String smell;

    public Violet(String country, int shelfLife, double price, String smell) {
        super(country, shelfLife, price);
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }
}
