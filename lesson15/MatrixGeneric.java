package lesson15;

import java.util.Arrays;

public class MatrixGeneric<T extends Number, V extends Number,
        K extends Number> {
    private T[][] array;
    private V lines;
    private K columns;

    public MatrixGeneric(T[][] array, V lines, K columns) {
        this.array = array;
        this.lines = lines;
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "" + Arrays.deepToString(array)
                + "";
    }

    public void multNumb(int number) {
        double[][] arrayNumbMult = new double[lines.intValue()][columns.intValue()];
        for (int i = 0; i < lines.intValue(); i++) {
            for (int j = 0; j < columns.intValue(); j++) {
                arrayNumbMult[i][j] = array[i][j].doubleValue() * number;
            }
        }
        System.out.println(Arrays.deepToString(arrayNumbMult));
    }

    MatrixGeneric sum(MatrixGeneric object) {
        if (lines.equals(object.lines) && columns.equals(object.columns)) {
            for (int i = 0; i < lines.intValue(); i++) {
                for (int j = 0; j < columns.intValue(); j++) {
                    object.array[i][j] = this.array[i][j].doubleValue()
                            + object.array[i][j].doubleValue();
                }
            }
        } else {
            System.out.println("Lines and columns must be equal!");
            System.exit(0);
        }
        return object;
    }

    void mult(MatrixGeneric object) {
        double[][] arrayMult = new double[lines.intValue()][object.columns.intValue()];
        if (columns.equals(object.lines)) {
            for (int i = 0; i < lines.intValue(); i++) {
                for (int j = 0; j < object.columns.intValue(); j++) {
                    for (int k = 0; k < object.lines.intValue(); k++)
                        arrayMult[i][j] += this.array[i][k].doubleValue()
                                * object.array[k][j].doubleValue();
                }
            }
        } else {
            System.out.println("Lines and columns must be equal!");
            System.exit(0);
        }
        System.out.println(Arrays.deepToString(arrayMult));
    }

    public static void main(String[] args) {
        Integer[][] arrayBasic = {
                {1, 2, 5},
                {7, 9, 12},
                {15, 29, 43}
        };

        Double[][] array2 = {
                {10.0, 11.0, 12.0},
                {14.0, 15.0, 24.0},
                {11.0, 4.0, 6.0}
        };

        Integer[][] array3 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        MatrixGeneric<Integer, Integer, Integer> mat
                = new MatrixGeneric<>(arrayBasic, 3, 3);
        mat.multNumb(4);

        MatrixGeneric<Double, Integer, Integer> mat2
                = new MatrixGeneric<>(array2, 3, 3);
        mat.sum(mat2);
        System.out.println(mat2);

        MatrixGeneric<Integer, Integer, Integer> mat3 = new MatrixGeneric<>(array3, 3, 3);
        mat.mult(mat3);
    }
}