package lesson4;

import java.util.Scanner;

public class SmallestModule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = module(sc);
        int k = module(sc);
        int m = module(sc);

        if (i < k && i < m) {
            System.out.println("Наименьшее число по модулю " + i);
        } else if (k < i && k < m) {
            System.out.println("Наименьшее число по модулю " + k);
        } else {
            System.out.println("Наименьшее число по модулю " + m);
        }
    }

    public static int module(Scanner scanner) {
        System.out.print("Введите число: ");
        int numb = 0;
        if (scanner.hasNextInt()) {
            numb = scanner.nextInt();
            numb = numb < 0 ? -numb : numb;
        } else {
            System.out.println("Необходимо ввести целое число!");
            System.exit(0);
        }
        return numb;
    }
}
