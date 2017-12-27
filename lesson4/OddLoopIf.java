package lesson4;

public class OddLoopIf {
    public static void main(String[] args) {
        String str = args.length > 0 ? args[0] : "Error";
        int i = Integer.parseInt(str);

        if (i % 2 != 0) {
            System.out.println(i);
        } else {
            System.out.println("Your number is even!");
        }
    }
}
