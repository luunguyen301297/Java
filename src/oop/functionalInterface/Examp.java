package oop.functionalInterface;

import java.util.Arrays;
import java.util.List;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/24/2023, Tuesday
 **/
public class Examp {
  @FunctionalInterface
  interface ExacutorInterface {
    public int execute(int a, int b);
  }
  //  :: , () -> {}

  public static void main(String[] args) {
    int a = 30, b = 20;
//    System.out.println("a + b = " + MathUtils.sum(a, b));
//    System.out.println("a + b = " + execute(a, b, MathUtils::sum));
    MathUtils obj = new MathUtils();
    System.out.println("a + b = " + execute(a, b, obj::sum));

    List string = Arrays.asList("a", "b");
    string.forEach(System.out::println);
  }

  public static int execute(int a, int b, ExacutorInterface exacutorInterface) {
    return exacutorInterface.execute(a, b);
  }
}
