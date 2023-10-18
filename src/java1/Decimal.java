package java1;

import java.lang.Math;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/10/2023, Tuesday
 **/
public class Decimal {
  public static String decimal(int decimalNumber, int base) {
    String remainder = "";

    if (decimalNumber < 0 || base < 0) {
      System.out.println(">=0 only");
    } else if (decimalNumber == 0) {
      remainder = "0";
    } else {
      while (decimalNumber > 0) {
        remainder = String.valueOf(decimalNumber % base) + remainder;
        decimalNumber /= base;
      }
    }
    return remainder;
  }

  public static int decimal2(int decimalNumber, int base) {
    int remainder = 0;

    if (decimalNumber < 0 || base < 0) {
      System.out.println(">=0 only");
    } else if (decimalNumber == 0) {
      return 0;
    } else {
      int i = 0;
      while (decimalNumber > 0) {
        remainder += (decimalNumber % base) * (int)Math.pow(10, i);
        decimalNumber /= base;
        i++;
      }
    }
    return remainder;
  }

  public static int decimal3(int decimalNumber, int base) {
    int remainder = 0;

    if (decimalNumber < 0 || base < 0) {
      System.out.println(">=0 only");
    } else if (decimalNumber == 0) {
      return 0;
    } else {
      remainder = decimalNumber % base;
    }
    return decimal3(decimalNumber / base, base) * 10 + remainder;
  }

  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter number");
//    int decimalNumber = scanner.nextInt();
//    System.out.println("Enter base");
//    int base = scanner.nextInt();
//    System.out.println("Result : " + decimal(decimalNumber,base));
    System.out.println(decimal3(16, 2));
  }
}
