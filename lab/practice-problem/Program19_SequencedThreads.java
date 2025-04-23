class Odd extends Thread {
  public void run() {
    for (int i = 1; i <= 30; i += 2) System.out.println("Odd: " + i);
  }
}

class Even extends Thread {
  public void run() {
    for (int i = 30; i >= 2; i -= 2) System.out.println("Even: " + i);
  }
}

public class Program19_SequencedThreads {
  public static void main(String[] args) {
    Thread t1 = new Odd();
    Thread t2 = new Even();

    t1.start();
    try {
      t1.join();
    } catch (InterruptedException e) {
    }
    t2.start();
  }
}
