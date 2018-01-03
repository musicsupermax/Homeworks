package lesson5B;

public class FactorialLoopFor {
    public static void main(String[] args) {
        int rund = (int) (Math.random() * 13);

        System.out.println("Factorial of " + rund + " is " + factor(rund));
    }

    public static int factor(int i) {
        int k = 1;

        for (int n = 1; n <= i; n++) {
            k = k * n;
        }
        return k;
    }
}
