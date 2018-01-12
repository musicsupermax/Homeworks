package lesson3;

import java.util.Scanner;

public class SummOfInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = inputValue(sc);
        int x = inputValue(sc);

        System.out.println("Сумма чисел = " + (i + x));
    }

    public static int inputValue(Scanner sc) {
        System.out.print("Введите целое число ");
        while (!sc.hasNextInt()) {
            System.out.println("Ошибка ввода. Введите целое число: ");
            sc.nextLine();
        }
        return sc.nextInt();
    }
}
