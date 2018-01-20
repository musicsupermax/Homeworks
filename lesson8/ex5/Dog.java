package lesson8.ex5;

public class Dog extends Animal {
    private double tailLength;

    public Dog(String food, String location, double tailLength) {
        super(food, location);
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public void makeNoise() {
        System.out.println("Woof!");
    }

    public void eat() {
        System.out.println("Meat!");
    }
}
