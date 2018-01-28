package lesson8.ex5;

public class Cat extends Animal {
    private double jumpUpLength;

    public Cat(String food, String location, double jumpUpLength) {
        super(food, location);
        this.jumpUpLength = jumpUpLength;
    }

    public double getJumpUpLength() {
        return jumpUpLength;
    }

    public void setJumpUpLength(double jumpUpLength) {
        this.jumpUpLength = jumpUpLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return Double.compare(cat.jumpUpLength, jumpUpLength) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(jumpUpLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "jumpUpLength=" + jumpUpLength +
                "} " + super.toString();
    }

    public void makeNoise() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("Fish");
    }
}
