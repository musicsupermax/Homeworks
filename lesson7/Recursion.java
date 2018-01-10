package lesson7;

public class Recursion {

    public static void main(String[] args) {
        rec(30, 10);
    }

    static int rec(int i, int b) {

        if (i < b) {
            System.out.print(i + " ");
            rec(i + 1, b);
            return i;
        } else if (i > b) {
            System.out.print(i + " ");
            rec(i - 1, b);
            return i;
        } else {
            System.out.print(i);
        }
        return i;
    }
}

