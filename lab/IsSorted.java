class IsSorted {
  static boolean isSorted(int[] arr) {
    boolean asc = true, desc = true;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] < arr[i + 1]) 
        asc = false;
      else desc = false;
    }
    return asc || desc;
  }
  public static void main(String[] args) {
    int[] arr = {6, 5, 3};
    System.out.println(isSorted(arr));
  }
}
