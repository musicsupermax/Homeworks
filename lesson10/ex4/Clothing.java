package lesson10.ex4;

public abstract class Clothing {
    private Clothes size;
    private double price;
    private String color;

    public Clothing(Clothes size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Clothes getSize() {
        return size;
    }

    public void setSize(Clothes size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clothing clothing = (Clothing) o;
        return Double.compare(clothing.price, price) == 0 &&
                size == clothing.size &&
                (color != null ? color.equals(clothing.color) :
                        clothing.color == null);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = size != null ? size.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
