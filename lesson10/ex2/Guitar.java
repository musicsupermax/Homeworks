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
    public void play() {
        System.out.println("The " + chordNumber + " strings guitar is playing " +
                Guitar.KEY + "!");
    }
}
