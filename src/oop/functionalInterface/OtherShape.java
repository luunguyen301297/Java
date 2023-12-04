package oop.functionalInterface;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/24/2023, Tuesday
 **/
public interface OtherShape {
  void draw();
  default void setColor(String color) {
    System.out.println(color);
  }
}
