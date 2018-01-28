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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Tie tie = (Tie) o;

        return material != null ? material.equals(tie.material) :
                tie.material == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (material != null ? material.hashCode() : 0);
        return result;
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
