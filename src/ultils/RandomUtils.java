package ultils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/14/2023, Saturday
 **/
public class RandomUtils {
  public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
  public static final String alphaUpperCase = alpha.toUpperCase();
  public static final String digits = "0123456789";

  private static Random random = new Random();
  public static String randomAlphaNumberic(int numberChar) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < numberChar; i++) {
      int num = random.nextInt(0, alpha.length() - 1);
      char c = alpha.charAt(num);
      stringBuilder.append(c);
    }
    return stringBuilder.toString();
  }

  public static Integer randomNumber(int min, int max) {
    return random.nextInt(max - min + 1) + min;
  }

  public static void testAdd(int size) {
    Random random1 = new Random();

    long startTime = System.currentTimeMillis();
    List<Long> list = new ArrayList<>();

    for (int i = 0; i < size; i++) {
      list.add(random1.nextLong());
    }
    System.out.println("Time : " + size + "element to list : " + (System.currentTimeMillis() - startTime));
  }
}
