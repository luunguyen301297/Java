package java1.thread.synchronize_thread_2;

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
    for (int i = 0; i < sharedData.userList.length; i++) {
      synchronized (sharedData) {
        System.out.println("User name : " + sharedData.userList[i]);

        sharedData.notifyAll();

        if (i < sharedData.userList.length - 1) {
          try {
            sharedData.wait();
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }

        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    }
    System.out.println("Thread 1 stop----------");
  }
}
