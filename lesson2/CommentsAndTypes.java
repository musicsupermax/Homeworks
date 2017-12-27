package lesson2;

public class CommentsAndTypes {
    /**
     * Method main is using for
     *
     * @param args
     */
    public static void main(String[] args) {
        //description
        /*System.out.println("Hello, world!!!");
        System.out.println("Hello, world!!!");
        System.out.println("Hello, world!!!");
        System.out.println("Hello, world!!!");*/

        int i1 = 45;
        System.out.println(i1);

        int i2 = 021;
        System.out.println(i2);

        int i3 = 0x023e;
        System.out.println(i3);

        int i4 = 0b1011;
        System.out.println(i4);

        long l = 0xfffffffffL;
        System.out.println(l);

        float f = 45.34f;
        System.out.println(f);

        double d1 = 3.4E+15;
        System.out.println(d1);

        double d2 = 3_332.4523;
        System.out.println(d2);

        boolean b = false;
        System.out.println(b);

        char c1 = '\u16E4';
        System.out.println(c1);

        char c2 = 344;
        System.out.println(c2);

        char c3 = '\'';
        System.out.println(c3);

        String str = "string1\nstring2\u16E4";
        System.out.println(str);
    }
}
