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
        int numb = sc.nextInt();

        numb = numb < 0 ? -numb : numb;
        return numb;
    }
}
