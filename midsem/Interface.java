interface RectangleTriangle {
  void area(double a, double b);
}

class Rectangle implements RectangleTriangle {
  @Override
  public void area(double a, double b) {
    System.out.println("Rectangle: " + a * b);
  }
}

class Triangle implements RectangleTriangle {
  @Override
  public void area(double a, double b) {
    System.out.println("Triangle: " + 0.5 * a * b);
  }
}

class Interface {
  public static void main(String[] args) {
    RectangleTriangle obj;

    obj = new Rectangle();
    obj.area(2, 3);
    
    obj = new Triangle();
    obj.area(2, 3);
  }
}
