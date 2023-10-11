package Java1;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/7/2023, Saturday
 **/
public class Recursion {
  static void test() {
    int count = 0;
    if (count < 10) {
      count++;
      System.out.println("Count " + count);
      test();
    }
  }

  static int giaiThua(int n) {
    if (n == 0) {
      return 1;
    } else {
      return (n * giaiThua(n - 1));
    }
  }

  static int n1 = 0, n2 = 1, n3 = 0;
  static void fibonacci(int count) {
    if (count > 0) {
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
      System.out.println(n3);
      fibonacci(count - 1);
    }
  }

  public static void main(String[] args) {
    int count = 15;
    System.out.println(n1 + n2);
    fibonacci(count - 2);
  }
}
