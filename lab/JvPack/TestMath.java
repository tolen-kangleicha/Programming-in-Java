import mathoperations.Addition;
import mathoperations.Multiplication;

public class TestMath {
  public static void main(String[] args) {
    Addition ad = new Addition();
    Multiplication mult = new Multiplication();
    System.out.println("Sum: " + ad.sum(2, 3));
    System.out.println("Product: " + mult.product(2, 3));
  }
}
