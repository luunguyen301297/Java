package ss2;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/10/2023, Tuesday
 **/
public class Human extends Animal{
  int foot, hand;

  public Human(String name, int foot, int hand) {
    super(name);
    this.foot = foot;
    this.hand = hand;
  }

  @Override
  public String showInfo() {
    return super.showInfo() +
      "Foot: " + foot + " , " +
      "Hand: " + hand;
  }

  @Override
  public void move() {

  }

  public static void main(String[] args) {
    Human a = new Human("a", 2, 2);
    System.out.println(a.showInfo());
  }
}
