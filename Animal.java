public abstract class Animal {
    private int age;

    public Animal() {
        this.age = 0;
    }

    public abstract void eat();
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
