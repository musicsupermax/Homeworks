package lesson3;

public class TypeConversion {
    public static void main(String[] args) {
        System.out.println(intToByte(126));
        System.out.println(byteToInt((byte) 180));
        System.out.println(byteToShort((byte) 55));
        System.out.println(byteToLong((byte) 256));
        System.out.println(byteToChar((byte) 78));
        System.out.println(byteToFloat((byte) 44));
        System.out.println(byteToDouble((byte) 190));
        System.out.println(shortToByte((short) 896));
        System.out.println(shortToInt((short) 93));
        System.out.println(shortToLong((short) 78924));
        System.out.println(shortToChar((short) 345));
        System.out.println(shortToFloat((short) 1256));
        System.out.println(shortToDouble((short) 863));
        System.out.println(charToByte((char) 'T'));
        System.out.println(charToShort((char) 'y'));
        System.out.println(charToInt((char) '$'));
        System.out.println(charToLong((char) '~'));
        System.out.println(charToDouble((char) '/'));
        System.out.println(charToFloat((char) '='));
        System.out.println(intToShort(475));
        System.out.println(intToLong(789_456));
        System.out.println(intToChar(987));
        System.out.println(intToFloat(344));
        System.out.println(intToDouble(57889));
        System.out.println(longToByte(745__321));
        System.out.println(longToShort(862));
        System.out.println(longToInt(789456123));
        System.out.println(longToChar(900));
        System.out.println(longToFloat(123456___123));
        System.out.println(longToDouble(4477889));
        System.out.println(floatToByte((float) 46.45));
        System.out.println(floatToShort((float) 456.213));
        System.out.println(floatToInt((float) 931254.894_56));
        System.out.println(floatToLong((float) 78454561.4567__8913));
        System.out.println(floatToChar((float) 5.4));
        System.out.println(floatToDouble((float) 777.111));
        System.out.println(doubleToByte(78.45));
        System.out.println(doubleToShort(456.123));
        System.out.println(doubleToInt(234.234_234));
        System.out.println(doubleToLong(123123.234444));
        System.out.println(doubleToChar(44556.33225));
        System.out.println(doubleToFloat(456456.456456456));
    }

    public static byte intToByte(int i1) {
        byte k = (byte) i1;
        return k;
    }

    public static int byteToInt(byte b1) {
        int i2 = b1;
        return i2;
    }

    public static short byteToShort(byte b2) {
        short s1 = b2;
        return s1;
    }

    public static long byteToLong(byte b3) {
        long l1 = b3;
        return l1;
    }

    public static char byteToChar(byte b4) {
        char c1 = (char) b4;
        return c1;
    }

    public static float byteToFloat(byte b5) {
        float f1 = b5;
        return f1;
    }

    public static double byteToDouble(byte b6) {
        double d1 = b6;
        return d1;
    }

    public static byte shortToByte(short s2) {
        byte b = (byte) s2;
        return b;
    }

    public static int shortToInt(short s) {
        int i = s;
        return i;
    }

    public static long shortToLong(short s) {
        long l = s;
        return l;
    }

    public static char shortToChar(short s) {
        char c = (char) s;
        return c;
    }

    public static float shortToFloat(short s) {
        float f = s;
        return f;
    }

    public static double shortToDouble(short s) {
        double d = s;
        return d;
    }

    public static byte charToByte(char c) {
        byte b = (byte) c;
        return b;
    }

    public static short charToShort(char c) {
        short s = (short) c;
        return s;
    }

    public static int charToInt(char c) {
        int i = c;
        return i;
    }

    public static long charToLong(char c) {
        long l = c;
        return l;
    }

    public static double charToDouble(char c) {
        double d = c;
        return d;
    }

    public static float charToFloat(char c) {
        float f = c;
        return f;
    }

    public static short intToShort(int i) {
        short s = (short) i;
        return s;
    }

    public static long intToLong(int i) {
        long l = i;
        return l;
    }

    public static char intToChar(int i) {
        char c = (char) i;
        return c;
    }

    public static float intToFloat(int i) {
        float f = i;
        return f;
    }

    public static double intToDouble(int i) {
        double d = i;
        return d;
    }

    public static byte longToByte(long l) {
        byte b = (byte) l;
        return b;
    }

    public static short longToShort(long l) {
        short s = (short) l;
        return s;
    }

    public static int longToInt(long l) {
        int i = (int) l;
        return i;
    }

    public static char longToChar(long l) {
        char c = (char) l;
        return c;
    }

    public static float longToFloat(long l) {
        float f = l;
        return f;
    }

    public static double longToDouble(long l) {
        double d = l;
        return d;
    }

    public static byte floatToByte(float f) {
        byte b = (byte) f;
        return b;
    }

    public static short floatToShort(float f) {
        short s = (short) f;
        return s;
    }

    public static int floatToInt(float f) {
        int i = (int) f;
        return i;
    }

    public static long floatToLong(float f) {
        long l = (long) f;
        return l;
    }

    public static char floatToChar(float f) {
        char c = (char) f;
        return c;
    }

    public static double floatToDouble(float f) {
        double d = f;
        return d;
    }

    public static byte doubleToByte(double d) {
        byte b = (byte) d;
        return b;
    }

    public static short doubleToShort(double d) {
        short s = (short) d;
        return s;
    }

    public static int doubleToInt(double d) {
        int i = (int) d;
        return i;
    }

    public static long doubleToLong(double d) {
        long l = (long) d;
        return l;
    }

    public static char doubleToChar(double d) {
        char c = (char) d;
        return c;
    }

    public static float doubleToFloat(double d) {
        float f = (float) d;
        return f;
    }
}

