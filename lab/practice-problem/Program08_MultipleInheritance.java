interface Square {
  double areaSquare(double side);
}

interface Circle {
  double areaCircle(double radius);
}

public class Program08_MultipleInheritance implements Square, Circle {
  public double areaSquare(double side) {
    return side * side;
  }

  public double areaCircle(double radius) {
    return Math.PI * radius * radius;
  }

  public static void main(String[] args) {
    Program08_MultipleInheritance obj = new Program08_MultipleInheritance();
    System.out.println("Area of Square: " + obj.areaSquare(5));
    System.out.println("Area of Circle: " + obj.areaCircle(3));
  }
}
