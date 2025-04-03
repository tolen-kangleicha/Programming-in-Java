public class PascalTriangle {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        int n = 6; // Number of rows
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int temp = 0; temp <= n - i; temp++) {
                System.out.print(" ");
            }

            // Print coefficients
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }
}
