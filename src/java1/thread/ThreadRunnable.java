package java1.thread;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/23/2023, Thursday
 **/
public class ThreadRunnable implements Runnable{
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread runnable >>> ");
      try {
        Thread.sleep(300);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
