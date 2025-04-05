import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numerator: ");
    int a = sc.nextInt();
    System.out.println("Enter denominator: ");
    int b = sc.nextInt();

    try {
      int result = a / b;
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: Cannot divide by zero!");
    }

    sc.close();
  }
}
