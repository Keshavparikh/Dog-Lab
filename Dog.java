public class Dog extends Animal
{
    protected String name;
    @Override
    public abstract void eat();
    @Override
    public void getAge(){

    }
@Override
    public void setAge(int age) {

    }

    public Dog(String name)
    {
	this.name = name;
    }

    public String getName()
    {
	return name;
    }
    // ------------------------------------------------------------
    // Returns a string with the dog's comments
    // ------------------------------------------------------------
    public String bark()
    {
	return "Dog barking";
    }

}
