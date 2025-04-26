class Table15 extends Thread {
  public void run() {
    for (int i = 1; i <= 5; i++) System.out.println("15 x " + i + " = " + (15 * i));
  }
}

class Table25 extends Thread {
  public void run() {
    for (int i = 1; i <= 5; i++) System.out.println("25 x " + i + " = " + (25 * i));
  }
}

public class Program18_TablesThreads {
  public static void main(String[] args) {
    new Table15().start();
    new Table25().start();
  }
}
