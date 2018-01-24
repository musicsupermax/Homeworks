package lesson10.ex4;

public class Clothing {
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
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
