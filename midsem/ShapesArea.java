abstract class Shapes {
  abstract void area(double a, double b);
}

class Rectangle extends Shapes {
  @Override
  void area(double a, double b) {
    System.out.println("Rectangle: " + a * b);
  }
}

class Triangle extends Shapes {
  @Override
  void area(double a, double b) {
    System.out.println("Triangle: " + 0.5 * a * b);
  }
}

class Circle extends Shapes {
  @Override
  void area(double a, double b) {
    System.out.println("Circle: " + 3.14 * a * a);
  }
}

class ShapesArea {
  public static void main(String[] args) {
    Shapes obj = new Rectangle();
    obj.area(2, 3);
    obj = new Triangle();
    obj.area(2, 3);
    obj = new Circle();
    obj.area(2, 0.0);
  }
}
