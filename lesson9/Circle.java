package lesson9;

/**
 * @author <i>Maksym Havryk</i>
 * @version <b>1.0
 * on 03.03.2018</b>
 * <p>
 * Public class Circle is creating for working
 * with figure Circle.
 */

public class Circle {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    /**
     * <b>Calculating the area of the Circle class object</b>
     */

    public void square() {
        double s = PI * radius * radius;
        System.out.println("Площадь окружности при радиусе " + getRadius() + " = " + s);
    }

    /**
     * <i>Calculating circuit of the Circle class object </i>
     */

    public void length() {
        double l = 2 * PI * radius;
        System.out.println("Длина окружности при радиусе " + getRadius() + " = " + l);
    }

    /**
     * In method main we are creating two Circle class objects
     * <p>and calculating square and circuit</p>.
     */

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        circle1.square();
        circle2.length();
    }
}
