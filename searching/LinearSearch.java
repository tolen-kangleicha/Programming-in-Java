import java.util.Scanner;

public class LinearSearch {
  private LinearSearch() {
    throw new UnsupportedOperationException("Utility class");
  }
  // Method to perform linear search
  public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    try(Scanner in = new Scanner(System.in)) {
      int[] arr = {10, 20, 30, 40, 50};

      System.out.print("Array: ");
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }

      System.out.print("\nEnter the element to be searched: ");
      int target = in.nextInt();

      int result = linearSearch(arr, target);
      if (result != -1) {
        System.out.println("Element found at index: " + result);
      } else {
        System.out.println("Element is not found.");
      }
    } 
    catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}

