class DisplayNums {
  static void display(int[] arr) {
    for (int i : arr) {
      if (i < 0) {
        System.out.print(i + " ");
      }
    }

    for (int i : arr) {
      if (i > 0) {
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = {-2, 2, 3, -1, -6, 3, 9, -5};
    display(arr);
  }
}
