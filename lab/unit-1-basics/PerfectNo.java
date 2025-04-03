import java.util.Scanner;

/**
 * This program checks if a given number is a perfect number.
 */
public final class PerfectNo {

  private PerfectNo() {
    throw new UnsupportedOperationException("Utility class");
  }

  /**
    * The main method that checks if a number is perfect.
    *
    * @param args Command-line arguments.
  */
  public static void main(final String[] args) {
    try (Scanner in = new Scanner(System.in)) { // Try-with-resources
      System.out.println("Enter a positive number: ");
      int num = in.nextInt();

      int sum = 0;
      for (int i = 1; i <= num / 2; i++) {
        if (num % i == 0) {
          sum += i;
        }
      }

      if (sum == num) {
        System.out.println("\nIt is a perfect number.");
      } else {
        System.out.println("\nIt is not a perfect number.");
      }
    }
  }
}
