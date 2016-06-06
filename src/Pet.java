public abstract class Pet {

    private String name;
    private int age;
    private String hungry;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHungry() {
        return hungry;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setHungry(String newHungry) {
        hungry = newHungry;
    }

    public abstract void voice();
}
