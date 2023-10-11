package ultils;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/11/2023, Wednesday
 **/
public class ReverseStringUtils {
  public static String reverseString(String baseStr) {
    String reverseStr = "";
    for (int i = 0; i < baseStr.length(); i++) {
      reverseStr = baseStr.charAt(i) + reverseStr;
    }
    return reverseStr;
  }
}
