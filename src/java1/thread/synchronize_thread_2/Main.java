package java1.thread.synchronize_thread_2;

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

    t2.start();
    t1.start();
  }
}
