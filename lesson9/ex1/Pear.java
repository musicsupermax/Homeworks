package lesson9.ex1;

public class Pear extends Fruit {
    private double cost;
    private String name;

    public Pear(double cost, String name) {
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
    public double getPrice() {
        return getCost() * getWeight();
    }
}
