import java.util.Scanner;

public class SumOfFibo {
    public static int sumOfFibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return sumOfFibo(n - 1) + sumOfFibo(n - 2) + 1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();
            System.out.println("Sum of first " + n + " Fibonacci numbers is: " + sumOfFibo(n - 1));
        }
    }
}
