public class NestedTryCatch {
  public static void main(String[] args) {
    try {
      try {
        int x = 10 / 0;
      } catch (ArithmeticException e) {
        System.out.println("Inner: ArithmeticException");
      }

      int[] arr = new int[2];
      arr[5] = 100;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Outer: ArrayIndexOutOfBoundsException");
    }
  }
}
