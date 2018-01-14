package lesson5A;

import java.util.Arrays;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] array = {7, 12, 1, 5, 2, 9};
        sortBasic(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
        sortChangedB(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
        sortChangedA(array);
        System.out.println(Arrays.toString(array));
    }
    /**
     * Стандартная сортировка пузырьком
     *
     * @param array
     */
    public static void sortBasic(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    /**
     * Минимальный элемент всплывает в конец массива
     *
     * @param array
     */
    public static void sortChangedB(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    /**
     * Досрочное завершение сортировки
     *
     * @param array
     */
    public static void sortChangedA(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean b = false;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    b = true;
                }
            }
            if (!b) {
                break;
            }
        }
    }
}
