package lesson10.ex4;

public class Skirt extends Clothing implements MensCloth, WomensCloth {
    private String shape;

    public Skirt(Clothes size, double price, String color, String shape) {
        super(size, price, color);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "shape='" + shape + '\'' +
                "} " + super.toString();
    }

    @Override
    public String dressMen() {
        return "Kilt";
    }

    @Override
    public String dressWom() {
        return "Women's skirt";
    }
}
