package lesson4;

public class Girlianda {
    public static void main(String[] args) {
        int numb = (int) (Math.random() * 40);
        System.out.println("Rundom number is: " + numb);
        System.out.println();
        System.out.println(blinker(numb));
        System.out.println();
        System.out.println(ticker(numb));
        System.out.println();
        System.out.println(maska(numb));
        System.out.println();
        System.out.println(currentState(numb));
    }

    static String blinker(int i) {
        for (int n = 0; n < 4; n++) {
            i = ~i;
            String trans = Integer.toBinaryString(i);
            int length = trans.length();

            for (int m = 32; length < m; length++) {
                System.out.print("0");
            }

            System.out.println(trans);
        }
        System.out.println();
        return "It was blinker!";
    }

    static String ticker(int i) {
        for (int n = 0; n < 10; n++) {
            i = i << 1;
            String trans = Integer.toBinaryString(i);
            int length = trans.length();

            for (int m = 32; length < m; length++){
                System.out.print("0");
            }
            System.out.println(trans);
        }
        System.out.println();
        return "It was ticker";
    }

    static String maska(int i) {
        int k = i & 1;
        String trans = Integer.toBinaryString(k);
        int length = trans.length();

        for (int n = 32; length < n; length++){
            System.out.print("0");
        }

        System.out.println(k);
        return "First position 1: lump is ON!" +
                "If 0 is OFF!";
    }

    static String currentState(int i) {
        String trans = Integer.toBinaryString(i);
        int length = trans.length();

        for (int m = 32; length < m; length++){
            System.out.print("0");
        }
        System.out.println(trans);
        return "It is current state!";
    }
}