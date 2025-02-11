// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import java.util.ArrayList;

public class DogTest
{
    public static void main(String[] args)
    {
        /*
//cant make objects of abstract classes
        //Making it a labrador ig
	Dog dog = new Labrador("Spike", "Color");
	System.out.println(dog.getName() + " says " + dog.bark());
    Labrador doggie = new Labrador("Keshav", "Red");
    System.out.println(doggie.getName() + " says "+doggie.bark());
	//getName is from the dog class
    Yorkshire york = new Yorkshire("New York", 15);
    System.out.println(york.getName()+" says "+york.bark());
    //Inherits from dog class
        york.waddle();
        //Dosent work cuz theres no waddle in Dog class or Labrador class. does not inherit from yorkshire
        doggie.waddle();

        Dog[] dogs = new Dog[3];
        dogs[0]=new Dog("arrDog");
        dogs[1]=new Labrador("arrLab", "Red");
        dogs[2]=new Yorkshire("arrLab", 12);

        for (int i = 0; i < dogs.length-1; i++) {
            dogs[i].bark();
        }

        for(Dog i : dogs) {
            i.bark();
        }
        //didnt have to call the bark method because they are in a dog arr. and the dog class has a bark method
        ((Labrador)dogs[1]).waddle();
        //I need to casrt becasue dog class dosent have a waddle method

        ArrayList<Dog> dogsList = new ArrayList<>();
//Same here as with line 17
        dogsList.add(new Labrador("listDog", "Color"));
        dogsList.add(new Labrador("listDog", "Blue"));
        dogsList.add(new Yorkshire("listDog", 10));

        for (int i = 0; i < dogsList.size(); i++) {
            dogsList.get(i).bark();
        }

        for(Dog i: dogsList){
            i.bark();
        }

*/

        ArrayList<Animal> ani = new ArrayList<>();
        ani.add(new Yorkshire("Name", 12));
        ani.add(new Labrador("Name1", "colour"));
        ani.add(new Dog("Name3") {
            @Override
            public void eat() {
                System.out.println("Im eating");
            }
        });

        ani.get(0).setAge(1);
        ani.get(1).setAge(2);
        ani.get(2).setAge(3);

        for(Animal i: ani){
            System.out.println(i.getAge());
            i.eat();
            //this wont work because everything here is an Animal, but the bark method is in the Dog class which is below (subclass) of the Animal class. to fix this i have to cast the Animal (or i) to a dog.
           if (i instanceof Dog) {
               System.out.println(((Dog) i).bark());
           }
            //Yeah, i dont know why it's not working
            //It says im using it, but its not printing.
            //i fixed it, i didnt put it in a SOP
        }

        }





	

    }

