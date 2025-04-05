public class ExceptionPropagation {
  static void method3() {
    throw new ArithmeticException("Exception from method3");
  }

  static void method2() {
    method3();
  }

  static void method1() {
    method2();
  }

  public static void main(String[] args) {
    try {
      method1();
    } catch (ArithmeticException e) {
      System.out.println("Handled in main: " + e.getMessage());
    }
  }
}
