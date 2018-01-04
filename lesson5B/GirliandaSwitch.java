package lesson5B;

import java.util.Scanner;

public class GirliandaSwitch {
    public static void main(String[] args) {
        int numb = (int) (Math.random() * 40);

        System.out.println("Blink: enter 1");
        System.out.println("Tick: enter 2");
        System.out.println("Checking first position: enter 3");
        System.out.println("Current state: enter 4");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, choose your variant: ");
        int i;
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println(blinker(numb));
                    break;
                case 2:
                    System.out.println(ticker(numb));
                    break;
                case 3:
                    System.out.println(maska(numb));
                    break;
                case 4:
                    System.out.println(currentState(numb));
                    break;
                default:
                    System.out.println("Pleese, enter a number from 1 to 4");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }

    static String blinker(int i) {
        for (int n = 0; n < 4; n++) {
            i = ~i;
            String trans = Integer.toBinaryString(i);
            int length = trans.length();

            for (int m = 32; length < m; length++) {
                System.out.print("0");
            }
            System.out.println(trans);
        }
        System.out.println();
        return "It was blinker!";
    }

    static String ticker(int i) {
        for (int n = 0; n < 10; n++) {
            i = i << 1;
            String trans = Integer.toBinaryString(i);
            int length = trans.length();

            for (int m = 32; length < m; length++) {
                System.out.print("0");
            }
            System.out.println(trans);
        }
        System.out.println();
        return "It was ticker";
    }

    static String maska(int i) {
        int k = i & 1;
        String trans = Integer.toBinaryString(k);
        int length = trans.length();

        for (int n = 32; length < n; length++) {
            System.out.print("0");
        }

        System.out.println(k);
        return "First position 1: lump is ON!" +
                "If 0 is OFF!";
    }

    static String currentState(int i) {
        String trans = Integer.toBinaryString(i);
        int length = trans.length();

        for (int m = 32; length < m; length++) {
            System.out.print("0");
        }
        System.out.println(trans);
        return "It is current state!";
    }
}
