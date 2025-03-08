import java.util.Scanner;

class PalindromeString {
  private PalindromeString() {
    throw new UnsupportedOperationException("Utility class.");
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a string: ");
      String str = sc.nextLine();
      str = str.toUpperCase();
      int len = str.length();

      boolean isPalin = true;
      for (int i = 0; i < len / 2; i++) {
        if (str.charAt(i) != str.charAt(len - i - 1)) {
          isPalin = false;
          break;
        }
      }

      if (isPalin) 
        System.out.println("It is a palindrome string.");
      else
        System.out.println("It is not a palindrome string.");
    }
  }
}
