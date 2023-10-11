package ultils;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/10/2023, Tuesday
 **/
public class NumberUtils {
  public static int getMinValue(int a , int b){
    return a < b ? a : b;
  }

  public  static int findUCLN(int a , int b) {
    int temp;
    while (b != 0) {
      temp = a % b;
      a = b;
      b = temp;
    }
    return a;
  }
}
