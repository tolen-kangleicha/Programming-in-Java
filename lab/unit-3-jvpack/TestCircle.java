import shapes.Circle;

public class TestCircle {
  public static void main(String[] args) {
    Circle obj = new Circle(7.0);
    double area = obj.area();

    System.out.println("Area of the Circle: " + area);
  }
}
