// this program demonstrates the concept of function overiding in java programming language 
package protected_java;
import java.util.Scanner;
public class function_overiding 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(); // create an object of the Circle class
        circle.calculateArea(radius);
        circle.calculatePerimeter(radius, radius);
        System.out.println("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.calculateArea(length, breadth);
        rectangle.calculatePerimeter(length, breadth);
        sc.close();
    }
    
}

