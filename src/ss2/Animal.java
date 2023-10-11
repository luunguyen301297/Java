package ss2;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/10/2023, Tuesday
 **/
public class Animal implements IMove {
  String name;

  public Animal(String name) {
    this.name = name;
  }

  @Override
  public String showInfo() {
    return "Name: " + name + " , ";
  }

  @Override
  public void move() {

  }
}
