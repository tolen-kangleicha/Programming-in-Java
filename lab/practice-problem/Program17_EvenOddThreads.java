class EvenThread extends Thread {
  public void run() {
    for (int i = 0; i <= 20; i += 2) System.out.print(i + " ");
  }
}

class OddThread extends Thread {
  public void run() {
    for (int i = 1; i <= 20; i += 2) System.out.print(i + " ");
  }
}

public class Program17_EvenOddThreads {
  public static void main(String[] args) {
    new EvenThread().start();
    new OddThread().start();
  }
}
