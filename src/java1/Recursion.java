package java1;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/7/2023, Saturday
 **/
public class Recursion {
  static int giaiThua(int n) {
    if (n == 0 || n == 1) {
      return 1;
    } else {
      return (n * giaiThua(n - 1));
    }
  }

  static int fibonacci(int n) {
    if (n < 0) {
      System.out.println("Enter n > 0 only");
    } else if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    System.out.println(fibonacci(8));
  }
}
