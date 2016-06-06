import java.util.Scanner;

/**
 * @author var1541b
 */
public class task07 {

    public static int mim(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static long min(long x, long y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static double min(double m, double n) {
        if (m < n) {
            return m;
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        int a, b;
        long x, y;
        double n, m;

        System.out.println("Введите числа типа int:");
        Scanner sc_a = new Scanner(System.in);
        a = sc_a.nextInt();
        Scanner sc_b = new Scanner(System.in);
        b = sc_b.nextInt();

        System.out.println("Введите числа типа long:");
        Scanner sc_x = new Scanner(System.in);
        x = sc_x.nextLong();
        Scanner sc_y = new Scanner(System.in);
        y = sc_y.nextLong();

        System.out.println("Введите числа типа double:");
        Scanner sc_m = new Scanner(System.in);
        m = sc_m.nextDouble();
        Scanner sc_n = new Scanner(System.in);
        n = sc_n.nextDouble();

        System.out.println("Наименьшее число из типа int:" + min(a, b));

        System.out.println("Наименьшее число из типа long:" + min(x, y));

        System.out.println("Наименьшее число из типа double:" + min(m, n));

    }
}
