package lesson3;

import java.util.Scanner;

public class SummOfInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int x;
        System.out.println("Введите два целых числа ");

        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            x = scanner.nextInt();
            System.out.println("Сумма чисел = " + (i + x));
        } else {
            System.out.println("Ошибка: введите целое число!");
        }
    }
}
