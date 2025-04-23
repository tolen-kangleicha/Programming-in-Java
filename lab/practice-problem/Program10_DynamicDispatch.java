class Shape {
  double area(double a, double b) {
    return 0;
  }
}

class Rectangle extends Shape {
  double area(double a, double b) {
    return a * b;
  }
}

class Triangle extends Shape {
  double area(double a, double b) {
    return 0.5 * a * b;
  }
}

class Circle extends Shape {
  double area(double a, double b) {
    return Math.PI * a * a;
  }
}

public class Program10_DynamicDispatch {
  public static void main(String[] args) {
    Shape s;

    s = new Rectangle();
    System.out.println("Rectangle Area: " + s.area(4, 5));

    s = new Triangle();
    System.out.println("Triangle Area: " + s.area(4, 5));

    s = new Circle();
    System.out.println("Circle Area: " + s.area(3, 0));
  }
}
