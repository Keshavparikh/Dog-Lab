// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever.  Overrides Dog speak method and includes
// information about avg weight for this breed.
//          
// ****************************************************************


public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?
    

    public Labrador(String name,  String color)
    {
        //didn't call the super constructor. fixed it
        super(name);
	this.color = color;
    }
@Override
public void eat(){
    System.out.println(name +" is eating");
}
    
    public String bark()
    {
	return "Labrador barking";
    }

    public void waddle()
    {
        System.out.println(name + " is doing a York waddle");
    }


}
