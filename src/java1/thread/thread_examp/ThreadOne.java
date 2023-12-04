package java1.thread.thread_examp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/23/2023, Thursday
 **/
public class ThreadOne implements Runnable{
  List<Integer> list = new ArrayList<>();

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      int randomInt = new Random().nextInt(100);
      list.add(randomInt);
      System.out.println("Thread 1 > " + randomInt);

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
