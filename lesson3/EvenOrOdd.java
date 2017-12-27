package lesson3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число ");
        int i;

        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            if (i % 2 == 0) {
                System.out.println("Вы ввели четное число!");
            } else {
                System.out.println("Вы ввели нечетное число!");
            }
        } else {
            System.out.println("Ошибка: введите целое число!");
        }
    }
}
