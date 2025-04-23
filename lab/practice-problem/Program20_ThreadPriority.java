public class Program20_ThreadPriority {
  public static void main(String[] args) {
    Thread main = Thread.currentThread();
    System.out.println("Main Thread Priority: " + main.getPriority());

    Thread t =
        new Thread(
            () -> {
              System.out.println(
                  "Child Thread running... Priority: " + Thread.currentThread().getPriority());
            });
    t.setPriority(Thread.MAX_PRIORITY);
    t.setDaemon(true);
    t.start();
  }
}
