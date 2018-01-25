package lesson10.ex2;

public class Horn implements Instrument {
    private double diameter;

    public Horn(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Horn horn = (Horn) o;

        return Double.compare(horn.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(diameter);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Horn{" +
                "diameter=" + diameter +
                '}';
    }

    @Override
    public void play() {
        System.out.println("The " + diameter + " horn is playing " +
                Horn.KEY + "!");
    }
}
