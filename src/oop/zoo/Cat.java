package oop.zoo;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/7/2023, Thursday
 **/
public class Cat extends Animals{
  protected String color;

  public Cat() {
  }

  public Cat(String name, String foodType, String color) {
    super(name, foodType);
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  @Override
  public void showSound() {
    super.showSound();
    if (getName() == "Cho") {
      System.out.println(this.getName() + " keu gaw gaw");
    } else if (getName() == "Meo") {
      System.out.println(this.getName() + " keu meow meow");
    }
  }
}
