import ultils.ReverseStringUtils;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/10/2023, Tuesday
 **/
public class Decimal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the decimal number : ");
    int decimalNumber = scanner.nextInt();
    System.out.println("Enter the base number to convert : ");
    int base = scanner.nextInt();
    String remainder = "";

    while (decimalNumber > 0) {
      remainder += String.valueOf(decimalNumber % base);
      decimalNumber /= base;
    }

    System.out.println("Result : " + ReverseStringUtils.reverseString(remainder));
  }
}
