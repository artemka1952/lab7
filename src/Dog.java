
class Dog extends Cat{

    public void getName() {
        System.out.println("Я - собака");
    }

    public Dog getChild() {
        return new Dog();
    }
}
