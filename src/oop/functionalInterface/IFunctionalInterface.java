package oop.functionalInterface;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/24/2023, Tuesday
 **/
@FunctionalInterface
public interface IFunctionalInterface {
  //duy nhat 1 method abstract, tru cac method cua lop object
  void doSomething();

  default void defaultMethod() {
//  easy for extend Interface
//  tranh dung class utils
//  ung dung trong lambda
  }

  static void staticMethod() {
//  static method : k cho phep ghi de
//  goi theo Class cha
  }

  int hashCode();
  String toString();
  boolean equals(Object obj);
}
