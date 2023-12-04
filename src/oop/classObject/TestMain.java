package oop.classObject;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/22/2023, Sunday
 **/
public class TestMain {
  public static void main(String[] args) {
    //-> Anonymous Class -> instance tu Anonymous Class
    //K co kha nang re-usability
    Animal tiger = new Animal("chicken", "shit") {
      @Override
      public void onRunning(String name) {
        System.out.println(name + " is running");
      }

      @Override
      public void showShow() {
        System.out.println("meo meo");
      }
    };
    tiger.showShow();
    tiger.onRunning("chicken");
  }
}
