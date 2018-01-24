package lesson10.ex4;

public class Trousers extends Clothing implements MensCloth, WomensCloth {
    private double legLength;

    public Trousers(Clothes size, double price, String color, double legLength) {
        super(size, price, color);
        this.legLength = legLength;
    }

    public double getLegLength() {
        return legLength;
    }

    public void setLegLength(double legLength) {
        this.legLength = legLength;
    }

    @Override
    public String toString() {
        return "Trousers{" +
                "legLength=" + legLength +
                "} " + super.toString();
    }

    @Override
    public String dressMen() {
        return "Men's trousers";
    }

    @Override
    public String dressWom() {
        return "Women's trousers";
    }
}
