public class Program01_PrimeNumbers {
  public static void main(String[] args) {
    int[] numbers = {29, 18, 4, 17, 19, 23, 5, 7, 2, 3, 8, 6, 11, 31, 35, 37, 40, 41, 43, 47};
    System.out.println("Prime numbers in the array:");
    for (int num : numbers) {
      if (isPrime(num)) {
        System.out.print(num + " ");
      }
    }
  }

  static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
