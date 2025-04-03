package shapes;

public class Circle {
  private double radius;

  public Circle(double rad) {
    radius = rad;
  }

  public double area() {
    return 3.14 * radius * radius;
  } 
}
