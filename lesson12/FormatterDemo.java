package lesson12;

import java.util.Formatter;

public class FormatterDemo {
    public static void main(String[] args) {
        printFormatter("Gogi Bugi", 5, "English");
    }

    public static void printFormatter(String fullName, int mark, String subject) {
        Formatter formatter = new Formatter();
        formatter.format("Студент %15s получил %3d по предмету %10s!", fullName, mark, subject);
        System.out.println(formatter);

        System.out.printf("Студент %15s получил %3d по предмету %10s!", fullName, mark, subject);
    }
}
