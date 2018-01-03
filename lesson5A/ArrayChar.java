package lesson5A;


import java.util.Arrays;

public class ArrayChar {
    public static void main(String[] args) {
        char[][] array = {
                {'A', '*'},
                {'g', '\''},
                {'N', '!'},
                {'R', '\u0316'}
        };
        System.out.println(Arrays.deepToString(array));
    }
}
