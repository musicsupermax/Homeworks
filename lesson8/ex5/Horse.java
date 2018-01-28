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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return Double.compare(horse.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(speed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "speed=" + speed +
                "} " + super.toString();
    }

    public void makeNoise() {
        System.out.println("Igogo!");
    }

    public void eat() {
        System.out.println("Oat");
    }
}
