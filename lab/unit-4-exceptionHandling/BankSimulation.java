import java.util.Scanner;

class InsufficientFundsException extends Exception {
  public InsufficientFundsException(String message) {
    super(message);
  }
}

class Bank {
  private int balance = 1000;

  public void withdraw(int amount) throws InsufficientFundsException {
    if (amount > balance)
      throw new InsufficientFundsException("Not enough balance!");
    balance -= amount;
    System.out.println("withdrawal successful. Remaining: " + balance);
  }
}

public class BankSimulation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Bank bank = new Bank();
    System.out.println("Enter amount to withdraw");
    int amount = sc.nextInt();

    try {
      bank.withdraw(amount);
    } catch (InsufficientFundsException e) {
      System.out.println("Error: " + e.getMessage());
    }

    sc.close();
  }
}
