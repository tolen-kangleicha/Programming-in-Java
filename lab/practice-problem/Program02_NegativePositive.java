public class Program02_NegativePositive {
  public static void main(String[] args) {
    int[] numbers = {-5, 3, -2, 6, -9, 4, -1, 7, 0, -8};
    System.out.println("Negative numbers:");
    for (int num : numbers) {
      if (num < 0) System.out.print(num + " ");
    }
    System.out.println("\nPositive numbers:");
    for (int num : numbers) {
      if (num > 0) System.out.print(num + " ");
    }
  }
}
