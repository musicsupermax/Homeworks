package lesson5A;

import java.util.Arrays;

public class ArraySelectionSorter {
    public static void main(String[] args) {

        int[] array = {7, 12, 1, 5, 2, 9};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }
}

