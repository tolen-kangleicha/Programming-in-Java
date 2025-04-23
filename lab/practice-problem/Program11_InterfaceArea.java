interface Shape {
  double area(double a, double b);
}

class Rectangle implements Shape {
  public double area(double a, double b) {
    return a * b;
  }
}

class Triangle implements Shape {
  public double area(double a, double b) {
    return 0.5 * a * b;
  }
}

class Circle implements Shape {
  public double area(double a, double b) {
    return Math.PI * a * a;
  }
}

public class Program11_InterfaceArea {
  public static void main(String[] args) {
    Shape s;

    s = new Rectangle();
    System.out.println("Rectangle Area: " + s.area(5, 4));

    s = new Triangle();
    System.out.println("Triangle Area: " + s.area(5, 4));

    s = new Circle();
    System.out.println("Circle Area: " + s.area(3, 0));
  }
}
