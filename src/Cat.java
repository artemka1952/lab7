
class Cat {

    public void getName() {
        System.out.println("Я - кошка");
    }

    public Cat getChild() {
        return new Cat();
    }
}
