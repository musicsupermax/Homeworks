package lesson4;

import java.util.Scanner;

public class ScannerPositiveOrNegative {
    public static void main(String[] args) {
        int i = scannerInt();

        if (i >= 0 && i < 10) {
            System.out.println("Положительное число от 0 до 10!");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное!");
        }
    }

    public static int scannerInt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int numb = 0;
        if (sc.hasNextInt()) {
            numb = sc.nextInt();
        } else {
            System.out.println("Необходимо ввести целое число!");
            System.exit(0);
        }
        return numb;
    }
}
