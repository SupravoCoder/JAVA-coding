// a java program to demonstrate the use of inheritance in java and method overriding
package protected_java;
public class practice1 // create a class named practice1 which is the main class
{
    public static void main(String[] args) 
    {
        // create an object of the derived class
        derived obj = new derived();
        // call the method of the derived class
        obj.display();
    }
}

// create a base class
class base 
{
    // create a method in the base class
    protected void display() 
    {
        System.out.println("This is the base class"); // display a message
    }
}


// create a derived class that inherits from the base class
class derived extends base 
{
    // override the method of the base class
    protected void display() 
    {
        System.out.println("This is the derived class");// display a message
    }
}

