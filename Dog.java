public abstract class Dog extends Animal
{
    protected String name;
    @Override
    public abstract void eat();

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
//        System.out.println("YOOO");
	return "Dog barking";
    }

}

//private final String name;

//private final String name;
