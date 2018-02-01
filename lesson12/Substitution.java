package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Substitution {
    public static void main(String[] args) {
        String str = "I like oBjeCt     orIented    proGramming!"
                + " I hate ObJect oriEnted programming!!!";
        printSub(str);
    }

    public static void printSub(String str) {
        String regex = "\\w{6}\\s*\\w{8}\\s*\\w{11}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.replaceAll("OOP"));
    }
}
