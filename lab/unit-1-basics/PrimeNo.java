import java.util.Scanner;

class PrimeNo {
    private PrimeNo() {
        throw new UnsupportedOperationException("Utility class.");
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("What's the size of array? ");
            int size = in.nextInt();
            int arr[] = new int[size];

            System.out.println("Enter the elements:");
            for (int i = 0; i < size; i++) {
                int item = in.nextInt();
                arr[i] = item;
            }

            System.out.println("\nThe prime nos. are:");
            for (int i = 0; i < size; i++) {
                if (isPrime(arr[i])) 
                    System.out.print(arr[i] + "  ");
            }
        }
    }

}
