package lesson11;

public class Wrappers {
    public static void main(String[] args) {
        Double doub1 = new Double(456);
        Double doub2 = new Double("785");
        Double doub3 = Double.valueOf(343);
        Double doub4 = Double.valueOf("12");
        double doub5 = Double.parseDouble("321");
        String str = Double.toString(4963);

        System.out.println(doub1);
        System.out.println(doub2);
        System.out.println(doub3);
        System.out.println(doub4);
        System.out.println(doub5);
        System.out.println(str);

        System.out.println(doub4.byteValue());
        System.out.println(doub4.shortValue());
        System.out.println(doub4.intValue());
        System.out.println(doub4.longValue());
        System.out.println(doub4.floatValue());

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
