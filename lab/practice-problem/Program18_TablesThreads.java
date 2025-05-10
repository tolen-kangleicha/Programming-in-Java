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
    Table15 t1 = new Table15();
    Table25 t2 = new Table25();

    t1.start();
    try {
      t1.join();
    } catch (InterruptedException e) {
    }
    t2.start();
  }
}
