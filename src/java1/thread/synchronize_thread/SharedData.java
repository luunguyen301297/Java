package java1.thread.synchronize_thread;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/23/2023, Thursday
 **/
public class SharedData {
  public int x = 0;
  public int randomInt;

  public synchronized void addInt(int plus) {
    x += plus;
    System.out.println("\n x = " + x);
    for (int i = 0; i < x; i++) {
      System.out.print(" " + i);
    }
  }
}
