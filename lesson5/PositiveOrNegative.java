package lesson5;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter an integer: ");

        if (scanner.hasNextInt()) {
            int numb = scanner.nextInt();

            if (numb >= 0 && numb <= 10) {
                System.out.println("A positive number is less then 10!");
            } else {
                System.out.println("A positive number is more then 10 or negative!");
            }
        } else {
            System.out.println("Error: Please, enter an integer!");
        }
    }
}

