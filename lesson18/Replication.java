package lesson18;

import java.io.*;

public class Replication {
    public static void main(String[] args) throws IOException {
        int size = 0;
        try (Writer writer = new FileWriter("src/lesson18/io\\b.txt");
             Reader reader = new FileReader("src/lesson18/io\\a.txt")) {

            while ((size = reader.read()) != -1) {
                writer.write(size);
            }
        }
    }
}
