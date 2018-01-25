package lesson10.ex2;

public class Guitar implements Instrument {
    private int chordNumber;

    public Guitar(int chordNumber) {
        this.chordNumber = chordNumber;
    }

    public int getChordNumber() {
        return chordNumber;
    }

    public void setChordNumber(int chordNumber) {
        this.chordNumber = chordNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return chordNumber == guitar.chordNumber;
    }

    @Override
    public int hashCode() {
        return chordNumber;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "chordNumber=" + chordNumber +
                '}';
    }

    @Override
    public void play() {
        System.out.println("The " + chordNumber + " strings guitar is playing " +
                Guitar.KEY + "!");
    }
}
