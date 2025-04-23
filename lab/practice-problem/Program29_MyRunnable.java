class Program29_MyRunnable implements Runnable {
  public void run() {
    System.out.println(
        Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
  }

  public static void main(String[] args) {
    Thread t1 = new Thread(new Program29_MyRunnable(), "Thread-One");
    Thread t2 = new Thread(new Program29_MyRunnable(), "Thread-Two");
    Thread t3 = new Thread(new Program29_MyRunnable(), "Thread-Three");

    t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t3.setPriority(Thread.NORM_PRIORITY);

    t1.start();
    t2.start();
    t3.start();
  }
}
