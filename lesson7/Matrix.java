package lesson7;

import java.util.Arrays;

public class Matrix {
    double [][] array;

    void sum(double[][] array) {
        for (int i = 0; i < array.length && array.length == this.array.length; i++) {
            for (int j = 0; j < array[i].length && array[i].length == this.array[i].length; j++) {
                this.array[i][j] = this.array[i][j] + array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(this.array) + "\n");
    }

    void multNumb(int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = this.array[i][j] * number;
            }
        }
        System.out.println(Arrays.deepToString(array) + "\n");
    }

    void mult(double[][] array) {
        for (int i = 0; i < array.length && array.length == this.array.length; i++) {
            for (int j = 0; j < array[i].length && array[i].length == this.array[i].length; j++) {
                this.array[i][j] = this.array[i][j] * array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(this.array) + "\n");
    }

    public Matrix() {
    }

    public static void main(String[] args) {
        double [][] array = {
                {1, 2, 5},
                {7, 9, 12}
        };

        double[][] array1 = {
                {10, 11, 12},
                {14, 15, 24}
        };
        Matrix mat = new Matrix();

        mat.sum(array1);
        mat.multNumb(4);
        mat.mult(array1);
    }
}
