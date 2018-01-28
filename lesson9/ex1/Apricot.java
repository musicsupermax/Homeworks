package lesson9.ex1;

public class Apricot extends Fruit {
    private double cost;
    private String name;

    public Apricot(double cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Apricot apricot = (Apricot) o;

        return Double.compare(apricot.cost, cost) == 0 &&
                (name != null ? name.equals(apricot.name) : apricot.name == null);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public double getPrice() {
        return getCost() * getWeight();
    }
}
