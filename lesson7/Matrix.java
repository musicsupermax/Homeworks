package lesson7;

import java.util.Arrays;

public class Matrix {
    private double[][] array;
    private int lines;
    private int columns;

    public Matrix(double[][] array, int lines, int columns) {
        this.array = array;
        this.lines = lines;
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "Matrix{" + Arrays.deepToString(array) +
                '}';
    }

    public void multNumb(int number) {
        double[][] arrayNumbMult = new double[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                arrayNumbMult[i][j] = array[i][j] * number;
            }
        }
        System.out.println(Arrays.deepToString(arrayNumbMult));
    }

    Matrix sum(Matrix object) {
        if (lines == object.lines && columns == object.columns) {
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < columns; j++) {
                    object.array[i][j] = this.array[i][j] + object.array[i][j];
                }
            }
        } else {
            System.out.println("Lines and columns must be equal!");
            System.exit(0);
        }
        return object;
    }

    void mult(Matrix object) {
        double[][] arrayMult = new double[lines][object.columns];
        if (columns == object.lines) {
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < object.columns; j++) {
                    for (int k = 0; k < object.lines; k++)
                        arrayMult[i][j] += this.array[i][k] * object.array[k][j];
                }
            }
        } else {
            System.out.println("Lines and columns must be equal!");
            System.exit(0);
        }
        System.out.println(Arrays.deepToString(arrayMult));
    }

    public static void main(String[] args) {
        double[][] arrayBasic = {
                {1, 2, 5},
                {7, 9, 12},
                {15, 29, 43}
        };

        double[][] array2 = {
                {10, 11, 12},
                {14, 15, 24},
                {11, 4, 6}
        };

        double[][] array3 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        Matrix mat = new Matrix(arrayBasic, 3, 3);
        mat.multNumb(4);

        Matrix mat2 = new Matrix(array2, 3, 3);
        mat.sum(mat2);
        System.out.println(mat2);

        Matrix mat3 = new Matrix(array3, 3, 3);
        mat.mult(mat3);
    }
}
