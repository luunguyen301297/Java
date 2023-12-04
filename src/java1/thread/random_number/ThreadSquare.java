package java1.thread.random_number;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/26/2023, Sunday
 **/
public class ThreadSquare implements Runnable{
  SharedData sharedData;

  public ThreadSquare(SharedData sharedData) {
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

        int random = sharedData.getRandom();
        random *= random;
        System.out.println("Square : " + random);
      }
    }
    synchronized (sharedData) {
      sharedData.notifyAll();
    }
  }
}
