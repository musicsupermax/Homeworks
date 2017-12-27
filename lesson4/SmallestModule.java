package lesson4;

import java.util.Scanner;

public class SmallestModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, k, m;

        System.out.print("Введите первое число  ");
        i = scanner.nextInt();

        System.out.print("Введите второе число  ");
        k = scanner.nextInt();

        System.out.print("Введите третье число  ");
        m = scanner.nextInt();

        i = i < 0 ? -i : i;
        k = k < 0 ? -k : k;
        m = m < 0 ? -m : m;

        if (i < k && i < m)
        {
            System.out.println("Наименьшее число по модулю " + i);
        }
        else if (k < i && k < m){
            System.out.println("Наименьшее число по модулю " + k);
        }
        else {
            System.out.println("Наименьшее число по модулю " + m);
        }
    }
}
