package lesson15;

import java.util.Arrays;

public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public void printMinMax() {
        double min = array[0].doubleValue();
        double max = array[0].doubleValue();
        for (T element : array) {
            if (element.doubleValue() > max) {
                max = element.doubleValue();
            } else if (element.doubleValue() < min) {
                min = element.doubleValue();
            }
        }
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
