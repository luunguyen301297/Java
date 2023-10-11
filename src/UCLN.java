import ultils.ConsoleUtils;
import ultils.NumberUtils;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/11/2023, Wednesday
 **/
public class UCLN {
  public static void main(String[] args) {
    System.out.println("Please enter a : ");
    int a = ConsoleUtils.getInt(0 , null);
    System.out.println("Please enter b : ");
    int b = ConsoleUtils.getInt();
    int UCLN = 0;

//    C1:
//    for (int i = 1; i <= NumberUtils.getMinValue(a, b); i++) {
//      if (a % i == 0 && b % i == 0) {
//        UCLN = i;
//      }
//    }
//    System.out.println(String.format("UCLN of %d and %d is  %d", a, b, UCLN));

//    C2:
    System.out.println((a > b) ? "UCLN : " + NumberUtils.findUCLN(a, b) : "UCLN : " + NumberUtils.findUCLN(b, a));
  }
}
