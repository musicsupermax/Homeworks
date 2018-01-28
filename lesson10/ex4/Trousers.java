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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Trousers trousers = (Trousers) o;

        return Double.compare(trousers.legLength, legLength) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(legLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
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
