package java1.thread.random_number;

import java.util.Random;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/26/2023, Sunday
 **/
public class ThreadRandomNumber implements Runnable{
  SharedData sharedData;

  public ThreadRandomNumber(SharedData sharedData) {
    this.sharedData = sharedData;
  }

  @Override
  public void run() {
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    for (int i = 0; i < 10; i++) {
      synchronized (sharedData) {
        int random = new Random().nextInt(100) + 1;
        sharedData.setRandom(random);
        System.out.println("Random number : " + random);

        sharedData.notifyAll();

        try {
          sharedData.wait();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
}
