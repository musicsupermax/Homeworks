package lesson12;

public class MiddleString {
    public static void main(String[] args) {
        String[] str = {"string", "code", "practice"};

        for (String string : str) {
            System.out.println(findMiddleString(string));
        }
    }

    public static String findMiddleString(String str) {
        int length = str.length();
        return str.substring(length / 2 - 1, length / 2 + 1);
    }
}
