package lesson3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int numb = inputValue();

        if (numb % 2 == 0) {
            System.out.println("Вы ввели четное число!");
        } else {
            System.out.println("Вы ввели нечетное число!");
        }
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
