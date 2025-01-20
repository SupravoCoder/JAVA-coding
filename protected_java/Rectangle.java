package protected_java;

public class Rectangle {
    private double length;
    private double breadth;


    public Rectangle(double length, double breadth) {
        this.length = length; // constructor to initialize the length and breadth of the rectangle
        this.breadth = breadth;//constructor to initialize the length and breadth of the rectangle 
    }

    public void calculateArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }

    public void calculatePerimeter(double length, double breadth) 
    {
        double perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

}
