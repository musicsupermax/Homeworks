package lesson7;

import java.util.Arrays;

public class Matrix {
    double[][] array;
    int lines;
    int columns;

    public Matrix(double[][] array) {
        this.array = array;
    }

    void sum(double[][] array) {
        lines = this.array.length;
        double[][] arraySum = new double[2][3];
        if (lines == array.length) {
            for (int i = 0; i < lines; i++) {
                columns = this.array[i].length;
                if (columns == array[i].length) {
                    for (int j = 0; j < columns; j++) {
                        arraySum[i][j] = this.array[i][j] + array[i][j];
                    }
                } else {
                    System.out.println("Columns have to be equal (2 x 2)!");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("Lines have to be equal (3 x 3)!");
            System.exit(0);
        }
        System.out.println(Arrays.deepToString(arraySum) + "\n");
    }

    void multNumb(int number) {
        double[][] arrayNumbMult = new double[2][3];
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                arrayNumbMult[i][j] = this.array[i][j] * number;
            }
        }
        System.out.println(Arrays.deepToString(arrayNumbMult) + "\n");
    }

    void mult(double[][] array) {
        lines = this.array.length;
        double[][] arrayMult = new double[2][3];
        if (lines == array.length) {
            for (int i = 0; i < lines; i++) {
                columns = this.array[i].length;
                if (columns == array[i].length) {
                    for (int j = 0; j < columns; j++) {
                        arrayMult[i][j] = this.array[i][j] * array[i][j];
                    }
                } else {
                    System.out.println("Columns have to be equal (2 x 2)!");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("Lines have to be equal (3 x 3)!");
            System.exit(0);
        }
        System.out.println(Arrays.deepToString(arrayMult) + "\n");
    }

    public static void main(String[] args) {
        double[][] arrayBasic = {
                {1, 2, 5},
                {7, 9, 12}
        };

        double[][] array2 = {
                {10, 11, 12},
                {14, 15, 24}
        };
        Matrix mat = new Matrix(arrayBasic);

        mat.sum(array2);
        mat.multNumb(4);
        mat.mult(array2);
    }
}
