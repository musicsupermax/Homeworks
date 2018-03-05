package lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        try (OutputStream output = new FileOutputStream("src\\lesson18\\io\\a.txt");
             InputStream input = new FileInputStream("src/lesson18/io/a.txt")) {
            char[] c = {'a', 'b', 'c'};

            for (char symbol : c) {
                output.write(symbol);
            }

            int size = input.available();
            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " ");
            }
        }
    }
}
