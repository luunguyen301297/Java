package java1.thread.synchronize_thread;

import java.util.Random;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/23/2023, Thursday
 **/
public class CustomThread implements Runnable{
  SharedData sharedData;

  public CustomThread(SharedData sharedData) {
    this.sharedData = sharedData;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      int randomInt = new Random().nextInt(5);
      sharedData.addInt(randomInt);
    }
  }
}
