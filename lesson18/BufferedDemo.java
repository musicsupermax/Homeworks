package lesson18;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new FileReader
                ("src\\lesson18\\io\\file.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter
                     ("src\\lesson18\\io\\newFile.txt"))) {
            String str;
            while ((str = bf.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
