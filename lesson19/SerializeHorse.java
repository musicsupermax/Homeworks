package lesson19;

import java.io.*;

public class SerializeHorse {
    public static final String CATALOG = "src\\lesson19\\file.ser";

    public static void main(String[] args) {
        Horse horse = new Horse(new Halter("Leather"), "Dolly");
        serialize(horse);
        Horse deserHorse = deserialize(horse);
        System.out.println(horse.equals(deserHorse));
    }

    public static void serialize(Horse horse) {
        try (FileOutputStream fos = new FileOutputStream(CATALOG);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(horse);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Horse deserialize(Horse horse) {
        try (FileInputStream fis = new FileInputStream(CATALOG);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            horse = (Horse) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.getStackTrace();
        }
        return horse;
    }
}
