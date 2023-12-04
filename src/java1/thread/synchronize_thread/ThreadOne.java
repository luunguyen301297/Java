package java1.thread.synchronize_thread;

import java.util.Random;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/23/2023, Thursday
 **/
public class ThreadOne implements Runnable{
  SharedData sharedData;

  public ThreadOne(SharedData sharedData) {
    this.sharedData = sharedData;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      synchronized (sharedData) {
        int randomInt = new Random().nextInt(100);
        sharedData.randomInt = randomInt;
        System.out.println("Thread one > " + randomInt);

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
