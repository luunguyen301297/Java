package java1.exceptionEx;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/27/2023, Wednesday
 **/
public class Exception_Calculator {
  public static float devide(float x, float y) throws Exception_DevideByZero {
    if (y == 0) {
      throw new Exception_DevideByZero(x, y);
    }
    return x/y;
  }
}
