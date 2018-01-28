package lesson8.ex4;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Tulip tulip = (Tulip) o;

        return shape != null ? shape.equals(tulip.shape) : tulip.shape == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (shape != null ? shape.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "shape='" + shape + '\'' +
                "} " + super.toString();
    }
}
