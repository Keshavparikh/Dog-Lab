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

	Dog dog = new Dog("Spike");
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

        dogsList.add(new Dog("listDog"));
        dogsList.add(new Labrador("listDog", "Blue"));
        dogsList.add(new Yorkshire("listDog", 10));

        for (int i = 0; i < dogsList.size()-1; i++) {
            dogsList.get(i).bark();
        }

        for(Dog i: dogsList){
            i.bark();
        }






	

    }
}
