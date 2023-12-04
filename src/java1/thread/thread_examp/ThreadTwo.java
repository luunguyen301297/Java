package java1.thread.thread_examp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/23/2023, Thursday
 **/
public class ThreadTwo implements Runnable{
  List<Character> list = new ArrayList<>();
  @Override
  public void run() {
    int min = 'a';
    int max = 'z';

    for (int i = 0; i < 10; i++) {
      int randomChar = new Random().nextInt(max - min) + min;
      char c = (char) randomChar;
      list.add(c);
      System.out.println("Thread 2 > " + c);

      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
