package oop.functionalInterface;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/24/2023, Tuesday
 **/
public class TestFunctional extends ShapeAbstractClass implements Shape, OtherShape{
  @Override
  public void draw() {

  }

  @Override
  public void setColor(String color) {
    Shape.super.setColor(color);
  }
//  @Override
//  public void draw() {
//    System.out.println("test");
//  }
//
//  @Override
//  public void setColor(String color) {
//    Shape.super.setColor(color);
//  }

  public static void main(String[] args) {
    TestFunctional testFunctional = new TestFunctional();
    testFunctional.setColor("red");
  }
}
