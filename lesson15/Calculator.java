package lesson15;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(multiply(25, 32));
        System.out.println(sum(78, 96));
        System.out.printf("%.4s %n", divide(55, 34));
        System.out.println(subtraction(100, 100));
    }

    public static <T, V> Number multiply(Number number1, Number number2) {
        return number1.doubleValue() * number2.doubleValue();
    }

    public static <T, V> Number sum(Number number1, Number number2) {
        return number1.doubleValue() + number2.doubleValue();
    }

    public static <T, V> Number divide(Number number1, Number number2) {
        return number1.doubleValue() / number2.doubleValue();
    }

    public static <T, V> Number subtraction(Number number1, Number number2) {
        return number1.doubleValue() - number2.doubleValue();
    }
}
