class Palindrome {
  static boolean isPalin(String str) {
    int start = 0, end = str.length() - 1;
    boolean palin = true;
    while (start <= end) {
      if (str.charAt(start) != str.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "mom dad tomz";
    String[] words = str.split("\\s");

    System.out.println("The palindrome words are:");
    for (String word : words) {
      if (isPalin(word)) {
        System.out.print(word + " ");
      }
    }
  }
}
