import java.util.Scanner;

// Abstract class
abstract class Shape {
    String color;

    // Abstract method
    abstract double area();

    // Concrete method
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

// Concrete subclass
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter the color of the circle: ");
            String color = scanner.nextLine();

            Circle circle = new Circle(radius);
            circle.setColor(color);

            System.out.println("Circle color: " + circle.getColor());
            System.out.println("Circle area: " + circle.area());
        }
    }
}
