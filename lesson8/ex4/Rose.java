package lesson8.ex4;

public class Rose extends Flower {
    private String color;

    public Rose(String country, int shelfLife, double price, String color) {
        super(country, shelfLife, price);
        this.color = color;
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
        if (!super.equals(o)) return false;

        Rose rose = (Rose) o;

        return color != null ? color.equals(rose.color) : rose.color == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
