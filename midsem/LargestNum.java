class LargestNum {
  public static void main(String[] args) {
    int max = Integer.MIN_VALUE;
    for (String str : args) {
      int num = Integer.parseInt(str);
      if (num > max) {
        max = num;
      }
    }

    System.out.println("Max = " + max);
  }
}
