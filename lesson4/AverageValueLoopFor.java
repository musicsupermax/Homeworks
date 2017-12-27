package lesson4;

public class AverageValueLoopFor {
    public static void main(String[] args) {
        double arguments = args.length;
        double d1 = 0.0;

        for (String str : args) {
            double d = Double.parseDouble(str);
            d1 = d + d1;
        }

        double d2 = d1 / arguments;
        System.out.println("Averge value is " + d2);
    }
}
