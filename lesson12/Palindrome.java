package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Если есть хвосты по дз, начните с 1 " +
                "не сданного задания. 123 324 111 4554";
        printPalindrome(str);
    }

    public static void printPalindrome(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            StringBuilder stringBuilder = new StringBuilder(matcher.group());
            if (matcher.group().equals(stringBuilder.reverse().toString())) {
                System.out.println(stringBuilder);
            }
        }
    }
}

