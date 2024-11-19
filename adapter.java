// adapter in java with example

/// The Adapter pattern is a structural design pattern that allows objects with incompatible interfaces to work together.
///It is used to make two incompatible interfaces compatible without changing their existing code. 
///The Adapter pattern is also known as the Wrapper pattern.
/// The Adapter pattern is implemented by creating a new class that acts as a bridge between the two incompatible interfaces.

// example of adapter pattern in java is:
// 1. The Adapter pattern is used in the Java Collections Framework to make legacy classes compatible with the new interfaces introduced in Java 1.2.

class LegacyRectangle // The LegacyRectangle class is a legacy which means it is an existing class
// that has an incompatible interface.
{

    public void draw(int x, int y, int width, int height) // x and y are the coordinates of the top-left corner of the
    // rectangle, and width and height are the dimensions of the
    // rectangle.
    {
        System.out.println("Drawing rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
}

interface Shape // The Shape interface defines the interface that the new classes must
// implement.
{
    abstract void draw(int x1, int y1, int x2, int y2); // The draw() method  is an abstract method that takes the coordinates of two points and
    
    // draws a shape between them (e.g., a rectangle, circle, etc.).
}

@SuppressWarnings("unused")

class RectangleAdapter implements Shape // The RectangleAdapter class is an adapter that makes the LegacyRectangle class
// compatible with the Shape interface.
{

    @SuppressWarnings("FieldMayBeFinal")

    private LegacyRectangle legacyRectangle; // The RectangleAdapter class contains an instance of the LegacyRectangle
    // class.

    public RectangleAdapter(LegacyRectangle legacyRectangle) // The RectangleAdapter class has a constructor that takes
    // a LegacyRectangle object as a parameter.
    {
        this.legacyRectangle = legacyRectangle; // The LegacyRectangle object is assigned to the instance variable.
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) // The draw() method of the RectangleAdapter class takes the
    // coordinates of two points and calculates the width and height of
    // the rectangle to be drawn.
    {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);

        legacyRectangle.draw(x, y, width, height); // The draw() method of the LegacyRectangle class is called with the
        // calculated coordinates and dimensions.
    }
}

public class adapter // The adapter class demonstrates how the Adapter pattern can be used to make
// legacy classes compatible with new interfaces.
{

    public static void main(String[] args) {
        LegacyRectangle legacyRectangle = new LegacyRectangle(); // Create a new LegacyRectangle object.

        Shape shape = new RectangleAdapter(legacyRectangle); // Create a new RectangleAdapter object with the
        // LegacyRectangle object as a parameter.

        shape.draw(10, 10, 20, 20); // Use the draw() method of the Shape interface to draw a rectangle.
        shape.draw(30, 45, 15, 12); // Use the draw() method of the Shape interface to draw a rectangle.
    }
}
