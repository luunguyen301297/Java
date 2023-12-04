package java1.thread;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/23/2023, Thursday
 **/
public class Test {
  public static void main(String[] args) throws InterruptedException {
    System.err.println("Start main thread");

    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          System.out.println("Thread 1 >> ");
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      }
    });
    thread1.start();

    Thread thread2 = new Thread(new ThreadRunnable());
    thread2.start();

    System.out.println("Thread 1 join to main");
    thread1.join();
    System.out.println("Thread 1 end");

    System.err.println("End main thread");
  }
}
