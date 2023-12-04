package java1.thread.thread_examp;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/23/2023, Thursday
 **/
public class Main {
  public static void main(String[] args) throws InterruptedException {
    ThreadOne threadOne = new ThreadOne();
    Thread t1 = new Thread(threadOne);
    ThreadTwo threadTwo = new ThreadTwo();
    Thread t2 = new Thread(threadTwo);

    t1.start();
    t2.start();
    t1.join();
    t2.join();

    System.err.println("Show result in main :");
    for (int i = 0; i < threadOne.list.size(); i++) {
      System.out.println(threadOne.list.get(i));
    }
    for (int i = 0; i < threadTwo.list.size(); i++) {
      System.out.println(threadTwo.list.get(i));
    }
  }
}
