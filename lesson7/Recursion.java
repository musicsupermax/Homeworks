package lesson7;

public class Recursion {

    public static void main(String[] args) {
        rowInt(30, 10);
        System.out.println();
        rowInt(10, 30);
    }

    static void rowInt(int a, int b) {
        if (a < b) {
            System.out.print(a + " ");
            rowInt(a + 1, b);
        } else if (a > b) {
            System.out.print(a + " ");
            rowInt(a - 1, b);
        } else {
            System.out.print(a);
        }
    }
}

