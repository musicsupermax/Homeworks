package lesson10.ex4;

public class Skirt extends Clothing implements WomensCloth {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Skirt skirt = (Skirt) o;

        return shape != null ? shape.equals(skirt.shape) : skirt.shape == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (shape != null ? shape.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "shape='" + shape + '\'' +
                "} " + super.toString();
    }

    @Override
    public String dressWom() {
        return "Women's skirt";
    }
}
