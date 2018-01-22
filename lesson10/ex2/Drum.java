package lesson10.ex2;

public class Drum implements Instrument {
    private double size;

    public Drum(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("The " + size + " drum is playing " +
                Drum.KEY + "!");
    }
}
