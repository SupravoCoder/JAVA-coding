// singleton pattern in java 
// its a creational pattern which is used to create only one instance of a class

//The Singleton pattern restricts a class to a single instance and provides a global point of access to that instance.
//It’s useful when only one instance of a class is needed, like in logging, configuration, or connection pooling.
// The Singleton pattern is implemented by creating a class with a method that creates a new instance of the class if one doesn’t exist.
class Singleton
{
    // Static variable to hold a single instance of the Singleton class
    private static Singleton instance;//private static instance of the class
    private Singleton() // private constructor
    {
        System.out.println("Singleton class created");
    }
    public static Singleton getInstance() // static method to get the instance of the class
    {
        if(instance == null) // if instance is null then create a new instance
        {
            instance = new Singleton(); // create a new instance
        }
        return instance; // return the instance
    }
}

public class Creational_pattern {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance(); // get the instance of the class
        System.out.println(s1); // use the instance
    }
}

//  output
//  Singleton class created

// The output Singleton@28a418fc is the default result when Java prints an object that does not have an overridden toString() method. This output is composed of:

//Class Name (Singleton): The name of the class you are creating, which is Singleton in this case.
//@ Symbol: This symbol separates the class name from the memory address hash.
//Memory Address Hash (28a418fc): A hexadecimal representation of the object's memory location hash code, which is unique to the specific instance of the class in the Java Virtual Machine (JVM).
//In other words, Singleton@28a418fc indicates:

//An instance of the Singleton class has been created.
//The instance is located at the memory address represented by 28a418fc.