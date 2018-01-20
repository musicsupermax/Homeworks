package lesson9.ex1;

public abstract class Fruit {
    private double weight;
    private String name;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public final void printManufacturerInfo() {
        System.out.println("Made in Ukraine!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPrice();
}
