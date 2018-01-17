package lesson8.Ex4;

public class Tulip extends Flower {
    private String shape;

    public Tulip(String country, int shelfLife, double price, String shape) {
        super(country, shelfLife, price);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
