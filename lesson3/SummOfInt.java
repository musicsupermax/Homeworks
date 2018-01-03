package lesson3;

import java.util.Scanner;

public class SummOfInt {

    public static void main(String[] args) {
        int i = inputValue();
        int x = inputValue();

        System.out.println("Сумма чисел = " + (i + x));
    }

    public static int inputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число ");
        while (!sc.hasNextInt()) {
            System.out.println("Ошибка ввода. Введите целое число: ");
            sc.nextLine();
        }
        int i = sc.nextInt();
        return i;
    }
}
