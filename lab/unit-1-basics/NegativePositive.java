import java.util.Scanner;

class NegativePositive {
    private NegativePositive() {
        throw new UnsupportedOperationException("Utility class.");
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int size = in.nextInt();
            int arr[] = new int[size];

            System.out.println("Enter elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = in.nextInt();
            }

            for (int i = 0; i < size; i++) {
                if (arr[i] < 0) {
                    System.out.print(arr[i] + ", ");
                }
            }

            for (int i = 0; i < size; i++) {
                if (arr[i] > 0) {
                    System.out.print(arr[i] + ", ");
                }
            }
        }
    }
}