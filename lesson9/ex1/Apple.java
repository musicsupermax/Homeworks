package lesson9.ex1;

public class Apple extends Fruit {
    private double cost;
    private String name;

    public Apple(double cost, String name) {
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

        Apple apple = (Apple) o;

        return Double.compare(apple.cost, cost) == 0 &&
                (name != null ? name.equals(apple.name) : apple.name == null);
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
        return "Apple{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public double getPrice() {
        return getCost() * getWeight();
    }
}
