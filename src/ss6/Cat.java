package ss6;

import ss6.Animal;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/14/2023, Saturday
 **/
public class Cat extends Animal {
  public String getName() {
    return super.name;
  }

  public void makeNoise() {
    System.out.println("Gau Gau");
  }
}
