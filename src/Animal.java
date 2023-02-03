public abstract class Animal {
    private int age;

    public Animal(){
        age = 0;
    }

    // If method is abstract, class must be abstract! Every child, in this case Dog class, must write its own eat method!
    public abstract String eat();

    public abstract String bark(); 

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    
}
