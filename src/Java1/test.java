package Java1;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/3/2023, Tuesday
 **/
public class test {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);

    list.forEach(num -> System.out.println(num));
  }
}
