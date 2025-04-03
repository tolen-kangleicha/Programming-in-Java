import java.util.Scanner;

class IncomeTax {
  private IncomeTax() {
    throw new UnsupportedOperationException("Utility class.");
  }
  static void calTax(String name, int income) {
    double tax;
    if (income <= 250000)
      tax = 0;
    else if (income <= 500000)
      tax = (income - 250000) * 0.1;
    else if (income <= 1000000)
      tax = 30000 + (income - 500000) * 0.2;
    else
      tax = 50000 + (income - 1000000) * 0.3;

    System.out.println("\nName: " + name + "\nTax: " + tax);
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter name: ");
      String name = sc.nextLine();
      System.out.print("Enter annual income: ");
      int income = sc.nextInt();

      IncomeTax.calTax(name, income);
    }
  }
}
