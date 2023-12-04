package java1.thread.random_number;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/26/2023, Sunday
 **/
public class SharedData {
  int random;

  public SharedData() {
  }

  public int getRandom() {
    return random;
  }

  public void setRandom(int random) {
    this.random = random;
  }

  public static void main(String[] args) {
    SharedData sharedData = new SharedData();
    Thread tRandom = new Thread(new ThreadRandomNumber(sharedData));
    Thread tSquare = new Thread(new ThreadSquare(sharedData));

    tRandom.start();
    tSquare.start();
  }
}
