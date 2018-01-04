package lesson4;

import java.util.Scanner;

public class SmallestModule {
    public static void main(String[] args) {
        int i = module();
        int k = module();
        int m = module();

        if (i < k && i < m) {
            System.out.println("Наименьшее число по модулю " + i);
        } else if (k < i && k < m) {
            System.out.println("Наименьшее число по модулю " + k);
        } else {
            System.out.println("Наименьшее число по модулю " + m);
        }
    }

    public static int module() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int numb = 0;
        if (sc.hasNextInt()) {
            numb = sc.nextInt();
            numb = numb < 0 ? -numb : numb;
        } else {
            System.out.println("Необходимо ввести целое число!");
            System.exit(0);
        }
        return numb;
    }
}
