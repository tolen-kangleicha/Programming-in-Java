import java.util.Scanner;

class Consonants {
  private Consonants() {
    throw new UnsupportedOperationException("Utility class");
  }
  public static void display(String s) {
    String str = s.toUpperCase();
    int len = str.length();

    for (int i = 0; i < len; i++) {
      char ch = str.charAt(i);
      if (ch != 'A' && 
          ch != 'E' && 
          ch != 'I' && 
          ch != 'O' && 
          ch != 'u')
        System.out.print(s.charAt(i));
    }
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      System.out.println("Enter a string: ");
      String str = in.nextLine();

      // Consonants obj = new Consonants();
      Consonants.display(str);
    }
  }
}
