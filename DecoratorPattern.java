import java.util.Scanner;

// decorator pattern is a structural design pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. The decorator pattern is often used to extend the functionality of an object without subclassing.
// It is an alternative to subclassing.
/*Example of Decorator Method Design Pattern

Below is the problem statement to understand decorator method design pattern in Java:

    Imagine a pizza shop where customers can customize their pizzas with various toppings like cheese, pepperoni, mushrooms, and olives. The goal is to create a flexible system that allows you to dynamically add any combination of toppings to a base pizza without modifying the existing pizza classes or creating numerous subclasses.

    The Decorator pattern helps solve this problem by allowing you to extend the behavior of a base pizza object dynamically.
    You can create decorators for each topping, which will add its specific functionality to the base pizza.*/

// Decorator pattern in Java

// Componenet Interface
interface Pizza {
    public String getDescription(); // returns the description of the pizza
    public double getCost();// returns the cost of the pizza
}

// Concrete Component
class Plain_Pizza implements Pizza 
// The Plain_Pizza class is a concrete component that implements the Pizza interface.
{
    public String getDescription() 
    {
        return "Thin dough";// The getDescription() method returns the description of the plain pizza.
    }

    public double getCost() 
    {
        return 4.00; // The cost of the plain pizza is $4.00.
    }
}


// Abstract Decorator Interface
@SuppressWarnings("unused")

abstract class ToppingDecorator implements Pizza
///This class implements the Pizza interface and holds a reference to a Pizza object. It delegates operations to the wrapped pizza object.
/// The ToppingDecorator class is an abstract decorator that implements the Pizza interface.
{
    protected Pizza tempPizza;// The ToppingDecorator class holds a reference to a Pizza object.

    public ToppingDecorator(Pizza newPizza) // The ToppingDecorator constructor takes a Pizza object as a parameter.
    {
        tempPizza = newPizza;
    }
    public String getDescription() 
    {
        return tempPizza.getDescription();
    }

    public double getCost() 
    {
        return tempPizza.getCost(); // The ToppingDecorator class delegates operations to the wrapped pizza object.
    }
}

// in summary the ToppingDecorator class is an abstract decorator that implements the Pizza interface. It holds a reference to a Pizza object and delegates operations to the wrapped pizza object. this allows additional toppings to be added to the pizza dynamically.

// Concrete Decorators
class Mozzarella extends ToppingDecorator // The Mozzarella class is a concrete decorator that extends the ToppingDecorator class.
{
    public Mozzarella(Pizza newPizza)  // The Mozzarella constructor takes a Pizza object as a parameter.
    {
        super(newPizza); // The super() constructor calls the constructor of the ToppingDecorator class.
        System.out.println("Adding Dough"); // The Mozzarella class adds mozzarella to the pizza.
        System.out.println("Adding Moz"); 
    }

    public String getDescription() 
    {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    public double getCost() 
    {
        return tempPizza.getCost() + 0.50; // the Mozzarella class is a concrete decorator that extends the ToppingDecorator class. It adds mozzarella to the pizza and increases the cost by $0.50.
    }
}

class Pepperoni extends ToppingDecorator 
{
    public Pepperoni(Pizza newPizza) 
    {
        super(newPizza);
        System.out.println("Adding Pepperoni");
    }

    public String getDescription() 
    {
        return tempPizza.getDescription() + ", Pepperoni";
    }

    public double getCost() 
    {
        return tempPizza.getCost() + 1.00;
    }
}

class Mushroom extends ToppingDecorator 
{
    public Mushroom(Pizza newPizza) 
    {
        super(newPizza);
        System.out.println("Adding Mushroom");
    }

    public String getDescription() 
    {
        return tempPizza.getDescription() + ", Mushroom";
    }

    public double getCost() 
    {
        return tempPizza.getCost() + 0.75;
    }
}

class Olives extends ToppingDecorator 
{
    public Olives(Pizza newPizza) 
    {
        super(newPizza);
        System.out.println("Adding Olives");
    }

    public String getDescription() 
    {
        return tempPizza.getDescription() + ", Olives";
    }

    public double getCost() 
    {
        return tempPizza.getCost() + 0.50;
    }
}

class Tomato extends ToppingDecorator 
{
    public Tomato(Pizza newPizza) 
    {
        super(newPizza);
        System.out.println("Adding Tomato");
    }

    public String getDescription() 
    {
        return tempPizza.getDescription() + ", Tomato";
    }

    public double getCost() 
    {
        return tempPizza.getCost() + 0.50; // The Tomato class is a concrete decorator that extends the ToppingDecorator class.
        // It adds tomato to the pizza and increases the cost by $0.50.
    }
}

// DecoratorPattern class
public class DecoratorPattern 
{
    public static void main(String[] args) 
    {
        Pizza basicPizza = new Plain_Pizza();
        // The main() method creates a plain pizza object and adds various toppings to it.

        // user choice the toppings to add to the pizza like switch case but not limited once and add multiple toppings to the pizza
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the toppings you want to add to the pizza: ");
        System.out.println("1. Mozzarella");
        System.out.println("2. Pepperoni");
        System.out.println("3. Mushroom");
        System.out.println("4. Olives");
        System.out.println("5. Tomato");
        System.out.println("6. Exit");
        int choice = sc.nextInt();
        while(choice != 6)
        {
            switch(choice)
            {
                case 1:
                    basicPizza = new Mozzarella(basicPizza);
                    break;
                case 2:
                    basicPizza = new Pepperoni(basicPizza);
                    break;
                case 3:
                    basicPizza = new Mushroom(basicPizza);
                    break;
                case 4:
                    basicPizza = new Olives(basicPizza);
                    break;
                case 5:
                    basicPizza = new Tomato(basicPizza);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Enter the toppings you want to add to the pizza: ");
            System.out.println("1. Mozzarella");
            System.out.println("2. Pepperoni");
            System.out.println("3. Mushroom");
            System.out.println("4. Olives");
            System.out.println("5. Tomato");
            System.out.println("6. Exit");
            choice = sc.nextInt();
        }
        sc.close();
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());
    }
}



