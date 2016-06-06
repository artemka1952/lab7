/**
 * @author var1541b
 */
public class task06 {

    public static int print(int a) {
        return a;
    }

    public static long print(long b) {
        return b;
    }

    public static double print(double c) {
        return c;
    }

    public static float print(float d) {
        return d;
    }

    public static byte print(byte e) {
        return e;
    }

    public static void main(String[] args) {
        int a = (int) 2147483647;
        long b = 9223372036854775807l;
        double c = (double) 123.12;
        float d = (float) 12.123123;
        byte e = (byte) 127;

        System.out.println(print(a));
        System.out.println(print(b));
        System.out.println(print(c));
        System.out.println(print(d));
        System.out.println(print(e));
    }
}
