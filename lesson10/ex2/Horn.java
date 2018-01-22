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
    public void play() {
        System.out.println("The " + diameter + " horn is playing " +
                Horn.KEY + "!");
    }
}
