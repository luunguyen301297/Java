package java1.thread.synchronize_thread;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/23/2023, Thursday
 **/
public class ThreadTwo implements Runnable{
  SharedData sharedData;

  public ThreadTwo(SharedData sharedData) {
    this.sharedData = sharedData;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      synchronized (sharedData) {
        sharedData.notifyAll();

        try {
          sharedData.wait();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }

        int result = sharedData.randomInt * sharedData.randomInt;
        System.out.println("Thread two > " + result);
      }
    }
  }
}
