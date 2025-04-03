import java.util.Scanner;

abstract class ShapeTest {
    double a, b;

    // Constructor to initialize dimensions
    ShapeTest(double x, double y) {
        a = x;
        b = y;
    }

    // Abstract method to calculate and display area
    abstract void printArea();
}

class RectangleTest extends ShapeTest {
    // Constructor to initialize Rectangle dimensions
    RectangleTest(double length, double width) {
        super(length, width);
    }

    // Implementation of area method for Rectangle
    @Override
    void printArea() {
        System.out.println("Area of Rectangle: " + (a * b));
    }
}

class TriangleTest extends ShapeTest {
    // Constructor to initialize Triangle dimensions
    TriangleTest(double base, double height) {
        super(base, height);
    }

    // Implementation of area method for Triangle
    @Override
    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * a * b));
    }
}

class CircleTest extends ShapeTest {
    // Constructor to initialize Circle dimensions
    CircleTest(double pi, double radius) {
        super(pi, radius);
    }

    // Implementation of area method for Circle
    @Override
    void printArea() {
        System.out.println("Area of Circle: " + (a * b * b));
    }
}

public class AbstractShapeTest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input for Triangle dimensions
            System.out.println("Enter the base and height of the triangle:");
            double baseTriangle = sc.nextDouble();
            double heightTriangle = sc.nextDouble();
            TriangleTest triangle = new TriangleTest(baseTriangle, heightTriangle);

            // Input for Rectangle dimensions
            System.out.println("Enter the length and width of the rectangle:");
            double lengthRectangle = sc.nextDouble();
            double widthRectangle = sc.nextDouble();
            RectangleTest rectangle = new RectangleTest(lengthRectangle, widthRectangle);

            // Input for Circle dimensions
            System.out.println("Enter the value of Pi and radius of the circle:");
            double pi = sc.nextDouble();
            double radius = sc.nextDouble();
            CircleTest circle = new CircleTest(pi, radius);

            // Calculate and display areas
            triangle.printArea();
            rectangle.printArea();
            circle.printArea();
        }
    }
}