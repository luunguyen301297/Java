package java1.thread.synchronize_thread_2;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/23/2023, Thursday
 **/
public class ThreadTwo implements Runnable{
  SharedData sharedData;

  public ThreadTwo(SharedData sharedData) {
    this.sharedData = sharedData;
  }

  @Override
  public void run() {
    for (int i = 0; i < sharedData.idList.length; i++) {
      synchronized (sharedData) {
        sharedData.notifyAll();

        try {
          sharedData.wait();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }

        System.out.println("ID : " + sharedData.idList[i]);
      }
    }
    System.out.println("Thread 2 stop----------");
  }
}
