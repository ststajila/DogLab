// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Spike");
        System.out.println(dog.getName() + " says " + dog.bark());

        Labrador labrador = new Labrador("Wednesday", "brown");
        System.out.println(labrador.getName() + ", " + labrador.bark());

        Yorkshire yorkshire = new Yorkshire("Misa", 3);
        System.out.println(yorkshire.bark());

        yorkshire.waddle();
        // it doesn't work because there is no waddle method in labrador class and there is no waddle method in the dog class, labrador inherits from a dog class
        labrador.waddle();

        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog("Max");
        dogs[1] = new Yorkshire("Bella", 5);
        dogs[2] = new Labrador("Luna", "white");

      for(int i = 0; i < dogs.length; i++){
            System.out.println(dogs[i].bark());
      }
        for(Dog action: dogs){
            System.out.println(action.bark());
        }

        /* There is no waddle method in the Dog class, labrador is stored as a dog class in the array, we need to cast to force the compiler to go down one level,
        * there is a bark method in the Dog class, so it checks if Labrador class overrides it, uses super class method if child didn't override it */
        ((Labrador)(dogs[2])).waddle();

        ArrayList<Dog> puppy = new ArrayList<Dog>();
        puppy.add(new Dog("Max"));
        puppy.add(new Yorkshire("Bella", 3));
        puppy.add(new Labrador("Luna", "white"));

        for (int i = 0; i < puppy.size(); i++){
            System.out.println(puppy.get(i).bark());
    }
        for (Dog cat: puppy){
            System.out.println(cat.bark());
        }

        ((Labrador)(puppy.get(2))).waddle();


    }
}
