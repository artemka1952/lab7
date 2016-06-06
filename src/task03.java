
/**
 * @author var1541b
 */
public class task03 {

    public static void main(String[] args) {
        System.err.println("Приняли роды. У нас родились: ");
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cat cat3 = cat.getChild();
        Dog dog3 = dog.getChild();

        System.out.println(dog3);
        System.out.println(cat3);
    }
}
