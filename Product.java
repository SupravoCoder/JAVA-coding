abstract class Product // The Product class is an abstract class that defines the interface for the products created by the factory method.
{
    public  abstract void use(); // The use() method is an abstract method that must be implemented by the concrete products.
}
abstract class Creator // The Creator class is an abstract class that defines the factory method for creating products.
{
    public abstract Product createProduct(); // The createProduct() method is an abstract method that must be implemented by the concrete creators.
}
