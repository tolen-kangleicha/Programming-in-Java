public class MultipleCatch {
  public static void main(String[] args) {
    try {
      int[] arr = new int[3];
      arr[5] = 10;
      int x = 10 / 0;
      String str = null;
      str.length();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index is invalid.");
    } catch (ArithmeticException e) {
      System.out.println("Divide by zero.");
    } catch (NullPointerException e) {
      System.out.println("Null pointer reference.");
    } finally {
      System.out.println("finally block executed.");
    }
  }
}
