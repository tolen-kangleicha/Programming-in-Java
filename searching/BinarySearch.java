import java.util.Scanner;

public class BinarySearch {
  private BinarySearch() {
    throw new UnsupportedOperationException("Utility class");
  }

  public static int binarySearch(int[] arr, int target) {
    int beg = 0, end = arr.length - 1;
    while (beg <= end) {
      int mid = (beg + end) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        beg = mid + 1;
      } else end = mid - 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int[] arr = {10, 20, 30, 40, 50};

      System.out.print("Array: ");
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }

      System.out.print("\nEnter the element to be searched: ");
      int target = in.nextInt();

      int result = binarySearch(arr, target);
      if (result != -1) {
        System.out.println("Element found at index: " + result);
      } else {
        System.out.println("Element is not found.");
      }
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
