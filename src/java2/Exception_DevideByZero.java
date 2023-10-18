package java2;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/27/2023, Wednesday
 **/
public class Exception_DevideByZero extends Exception{
  float x, y;

  public Exception_DevideByZero(float x, float y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String getMessage() {
    return "Exception / devide by zero";
  }
}
