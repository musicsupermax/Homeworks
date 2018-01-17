package lesson8.Ex5;

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

    public void makeNoise() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("Fish");
    }
}
