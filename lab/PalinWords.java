import java.util.Scanner;

class PalinWords {
  public boolean isPalin(String str) {
    int len = str.length();
    for (int i = 0; i < len / 2; i++) {
      if (str.charAt(i) != str.charAt(len - i - 1))
        return false;
    }
    return true;
  }

  public void displayPalinWords(String str) {
    String word = "";  // Properly initialize word
    str += " ";  // Append space to handle the last word
    
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      
      if (ch != ' ') {
        word += ch;  // Form the word
      } else {
        if (!word.isEmpty() && isPalin(word)) {
          System.out.println(word);
        }
        word = "";  // Reset word after checking
      }
    }
  }

  public static void main(String[] args) {
      String str;
      try (Scanner in = new Scanner(System.in)) {
          System.out.println("Enter a sentence:");
          str = in.nextLine();
      }

    PalinWords obj = new PalinWords();
    System.out.println("\nThe palindrome words are: ");
    obj.displayPalinWords(str);
  }
}