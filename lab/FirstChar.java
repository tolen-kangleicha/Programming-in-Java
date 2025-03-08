import java.util.Scanner;

class FirstChar {
  private FirstChar() {
    throw new UnsupportedOperationException("Utility class");
  }

  public void display(String s) {
    String str = " " + s;
    int len = str.length();

    for (int i = 0; i < len - 1; i++) {
      if (str.charAt(i) == ' ') {
        char ch = str.charAt(i + 1);
        if (Character.isUpperCase(ch))
          ch = Character.toLowerCase(ch);
        else ch = Character.toUpperCase(ch);
        System.out.print(ch);
      }
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    FirstChar obj = new FirstChar();
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a list of strings: ");
      String str = sc.nextLine();
      obj.display(str);
    }
  }
}
