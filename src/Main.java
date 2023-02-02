// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


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

//        //for(int i = 0; i < dogs.length; i++){
//            System.out.println(dogs[i].bark());
//    }
        for(Dog puppy: dogs){
            System.out.println(puppy.bark());
        }

        // We need to cast because lab
        ((Labrador)(dogs[2])).waddle();



    }
}
