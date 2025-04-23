class InsufficientBalanceException extends Exception {
  InsufficientBalanceException(String message) {
    super(message);
  }
}

public class Program15_BankWithdraw {
  static void withdraw(double balance, double amount) throws InsufficientBalanceException {
    if (amount > balance) {
      throw new InsufficientBalanceException("Insufficient Balance");
    } else {
      System.out.println("Transaction Successful. Remaining: " + (balance - amount));
    }
  }

  public static void main(String[] args) {
    try {
      withdraw(1000, 1500);
    } catch (InsufficientBalanceException e) {
      System.out.println(e.getMessage());
    }
  }
}
