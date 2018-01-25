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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drum drum = (Drum) o;

        return Double.compare(drum.size, size) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(size);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size=" + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println("The " + size + " drum is playing " +
                Drum.KEY + "!");
    }
}
