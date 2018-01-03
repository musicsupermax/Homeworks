package lesson5B;

public class NumbersDoWhile {
    public static void main(String[] args) {
        int numb = 1;

        do {
            if (numb % 5 == 0) {
                System.out.println(numb);
            }
            numb++;
        } while (numb <= 100);
    }
}
