package oop.zoo;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/7/2023, Thursday
 **/
public class test {
  public static void main(String[] args) {
    Cat cat = new Cat("Cho", "fish", "pink");
    cat.running();
    cat.showSound();

    Animals animal = new Animals("Meo", "fish");
    animal = new Cat(animal.getName(), animal.getFoodType(), "violet");
    animal.running();
//    animal.showSound();

//    Compile : animal is Animals
//    Runtime : animal is ss6.Cat
    if (animal instanceof Cat) {
      ((Cat) animal).showSound();
    }
  }
}
