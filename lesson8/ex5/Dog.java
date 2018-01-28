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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        return Double.compare(dog.tailLength, tailLength) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(tailLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tailLength=" + tailLength +
                "} " + super.toString();
    }

    public void makeNoise() {
        System.out.println("Woof!");
    }

    public void eat() {
        System.out.println("Meat!");
    }
}
