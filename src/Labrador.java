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
        //A parent's constructor was missing, Labrador's constructors acepts 2 parametrs, has only one variable to store a color.
        super(name);
        this.color = color;
    }


    public String bark()
    {
        return "Labrador barking";
    }

    public void waddle()
    {
        System.out.println(name + " is doing a Labrador waddle");
    }




}
