package lesson12;

public class StringDemo {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        printString(str);
    }

    public static void printString(String str) {
        System.out.println(str);
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.lastIndexOf("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(7, 11));
    }
}
