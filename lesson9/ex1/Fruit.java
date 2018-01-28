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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fruit fruit = (Fruit) o;

        return Double.compare(fruit.weight, weight) == 0 &&
                (name != null ? name.equals(fruit.name) : fruit.name == null);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract double getPrice();
}
