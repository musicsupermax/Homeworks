package lesson15;

public class MinMaxDemo {
    public static void main(String[] args) {
        Integer[] array = {1, 5, 8, 1, 7, 3};
        MinMax<Integer> object = new MinMax<>(array);
        object.printMinMax();
    }
}
