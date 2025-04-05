import java.util.Scanner;

public class ArrayAcess {
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter index to access: ");
    int index = sc.nextInt();

    try {
      System.out.println("Value at index " + index + ": " + arr[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: Index out of bounds!");
    }

    sc.close();
  }
}
