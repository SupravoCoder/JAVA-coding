//factory method pattern in java is a creational pattern which is used to create an object without exposing the creation logic to the client and refer to a newly created object using a common interface.

//The Factory Method pattern is a creational pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

//The Factory Method pattern is useful when you need to create an object that shares a common interface but may have different implementations.

//The Factory Method pattern is implemented by defining a method in the superclass that creates an object. Subclasses can then override this method to create different types of objects.

//The Factory Method pattern is similar to the Abstract Factory pattern, but it creates only one type of object, while the Abstract Factory pattern creates families of related objects.

//The Factory Method pattern is also similar to the Singleton pattern, but it creates new instances of objects instead of reusing a single instance.

// applications of factory method pattern in java in real world usage are:
// database connection management in JDBC API where we use DriverManager.getConnection() method to get the connection object.
// document processing in a word processor where we use DocumentFactory to create a new document object.
// UI components in a framework where we use ComponentFactory to create a new component object.
// payment processing in an e-commerce application where we use PaymentFactory to create a new payment object.
// app notifications in a mobile app where we use NotificationFactory to create a new notification object.


class ConcreteProductA extends Product  // The ConcreteProductA class is a concrete subclass of the Product class that implements the use() method to define how the product is used.

{
    public void use() // The use() method prints a message indicating that the product is being used.
    {
        System.out.println("Using Product A");
    }
}

class ConcreteProductB extends Product 
{
    public void use() 
    {
        System.out.println("Using Product B");
    }
}




class ConcreteCreatorA extends Creator // The ConcreteCreatorA class is a concrete subclass of the Creator class that implements the createProduct() method to create a ConcreteProductA object.
{

    public Product createProduct() // The createProduct() method creates a new ConcreteProductA object and returns it.
    {

        return new ConcreteProductA(); // The ConcreteCreatorA class is responsible for creating ConcreteProductA objects.
    }
}

class ConcreteCreatorB extends Creator 
{
    public Product createProduct() 
    {
        return new ConcreteProductB();
    }
}

public class Factory_method
{
    public static void main(String[] args) 
    {
        Creator creatorA = new ConcreteCreatorA(); // Create a new ConcreteCreatorA object.
        Product productA = creatorA.createProduct(); // Use the factory method to create a new ConcreteProductA object.
        productA.use(); // Use the product.

        Creator creatorB = new ConcreteCreatorB(); // Create a new ConcreteCreatorB object.
        Product productB = creatorB.createProduct(); // Use the factory method to create a new ConcreteProductB object.
        productB.use();
    }
}