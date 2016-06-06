
/**
 * @author var1541b
 */
public class task05 {

    public static int print(int a) {
        return a;
    }

    public static Integer print(Integer b) {
        int i = b.intValue() * 5;
        return i;
    }

    public static void main(String[] args) {
        int a = 10;
        Integer b = new Integer(100);

        System.out.println(print(a));
        System.out.println(print(b));

    }
}
