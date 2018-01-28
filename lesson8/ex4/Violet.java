package lesson8.ex4;

public class Violet extends Flower {
    private String smell;

    public Violet(String country, int shelfLife, double price, String smell) {
        super(country, shelfLife, price);
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Violet violet = (Violet) o;

        return smell != null ? smell.equals(violet.smell) : violet.smell == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (smell != null ? smell.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Violet{" +
                "smell='" + smell + '\'' +
                "} " + super.toString();
    }
}
