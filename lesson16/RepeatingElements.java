package lesson16;


import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RepeatingElements {
    public static void main(String[] args) {
        System.out.println(findUniqueElements(1, 2, 3, 4, 4, 5));
    }

    public static Set<Integer> findUniqueElements(Integer... elements) {
        Set<Integer> set = new TreeSet<>(Arrays.asList(elements));
        return set;
    }
}
