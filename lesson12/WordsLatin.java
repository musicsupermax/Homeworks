package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsLatin {
    public static void main(String[] args) {
        String str = "Go 123 there a1s2d1 top воля___";
        printLatinWords(str);
    }

    public static void printLatinWords(String str) {
        String regex = "[a-zA-Z]+\\W";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
