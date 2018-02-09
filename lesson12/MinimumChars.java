package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MinimumChars {
    public static void main(String[] args) {
        String str = "Asdfdf ddd d4f5 456 www ___";

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
