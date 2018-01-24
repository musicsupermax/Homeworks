package lesson10.ex4;

public class Tie extends Clothing implements MensCloth {
    private String material;

    public Tie(Clothes size, double price, String color, String material) {
        super(size, price, color);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Tie{" +
                "material='" + material + '\'' +
                "} " + super.toString();
    }

    @Override
    public String dressMen() {
        return "Super men's tie!";
    }
}
