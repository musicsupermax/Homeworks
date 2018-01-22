package lesson10.ex2;

public class InstrumentDemo {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        Drum drum = new Drum(55);
        Horn horn = new Horn(25);

        Instrument[] instruments = {guitar, drum, horn};

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
