package java1.thread.synchronize_thread;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/23/2023, Thursday
 **/
public class Main {
  public static void main(String[] args) {
    SharedData sharedData = new SharedData();

    Thread t1 = new Thread(new ThreadOne(sharedData));
    Thread t2 = new Thread(new ThreadTwo(sharedData));

    t1.start();
    t2.start();
  }
}
