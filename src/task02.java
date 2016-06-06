
/**
 * @author var1541b
 */
class task02 {

    public static void testing(Object obj) {
        if (obj instanceof Cat) {
            System.out.println("Объект класса Cat!");
        } else if (obj instanceof Dog) {
            System.out.println("Объект класса Dog!");
        } else if (obj instanceof Bird) {
            System.out.println("Объект класса Bird!");
        } else if (obj instanceof Lamp) {
            System.out.println("Объект класса Lamp!");
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Lamp lamp = new Lamp();
        testing(lamp);

    }
}
