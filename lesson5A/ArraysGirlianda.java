package lesson5A;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class ArraysGirlianda {
    public static void main(String[] args) {
        int[] numb = new int[32];

        for (int k = 0; k < numb.length; k++) {
            numb[k] = (int) (Math.random() * 40);
            if (numb[k] > 20) {
                numb[k] = 0;
            } else {
                numb[k] = 1;
            }
        }
        currentState(numb);
        System.out.println("It is current state!" + "\n");
        blinker(numb);
        System.out.println("It was blinker!" + "\n");
        ticker(numb);
        System.out.println("It was ticker!" + "\n");
        maska(numb);
    }

    static void blinker(int[] array) {
        for (int n = 0; n < 4; n++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == 0) {
                    array[j] = 1;
                } else {
                    array[j] = 0;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    static void ticker(int[] array) {
        for (int n = 0; n < 5; n++) {
            int i = array[0];
            System.arraycopy(array, 1, array, 0, 31);
            array[31] = i;
            System.out.println(Arrays.toString(array));
        }
    }

    static void maska(int[] array) {
        if (array[0] == 1) {
            System.out.println(Arrays.toString(array) + "\n" + "First lamp is on!");
        } else {
            System.out.println(Arrays.toString(array) + "\n" + "First Lamp is off!");
        }
    }

    static void currentState(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}