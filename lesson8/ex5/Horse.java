package lesson8.ex5;

public class Horse extends Animal {
    private double speed;

    public Horse(String food, String location, double speed) {
        super(food, location);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void makeNoise() {
        System.out.println("Igogo!");
    }

    public void eat() {
        System.out.println("Oat");
    }
}
