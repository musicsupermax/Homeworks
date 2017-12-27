package arrayslesson5;


import java.util.Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[][] array1 = {
                {4, 3, 2, 6, 8, 142, 98, 89},
                {5, 7, 12, 47, 56, 23, 20, 32},
                {34, 66, 77, 88, 125, 456, 987, 1},
                {0, 99, 75, 86, 23, 45, 63, 21},
                {56, 382, 8, 45, 51, 46, 90, 12}
        };
        minMax(array1);
    }

    public static void minMax(int[][] array2) {
        int[][] minMax = new int[array2.length][2];
        for (int i = 0; i < array2.length; i++) {
            int min = array2[i][0];
            int max = array2[i][0];
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] > max) {
                    max = array2[i][j];
                } else if (array2[i][j] < min) {
                    min = array2[i][j];
                }
            }
            minMax[i][0] = min;
            minMax[i][1] = max;
        }
        System.out.println(Arrays.deepToString(minMax));
    }
}
