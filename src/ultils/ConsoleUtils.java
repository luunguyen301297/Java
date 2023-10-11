package ultils;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/10/2023, Tuesday
 **/
public class ConsoleUtils {
  public static int getInt(Integer minValue , Integer maxValue){
    Scanner scanner = new Scanner(System.in);
    boolean valid = false;
    int n = 0;
    while (!valid){
      try {
        n = scanner.nextInt();
        valid = true;
        if (minValue != null) {  // only run here pass minValue  != null
          if (n < minValue) {
            System.out.println("Invalid");
            valid = false;
          }
        }
        if (maxValue != null) {  // only run here pass minValue  != null
          if (n > maxValue) {
            System.out.println("Invalid");
            valid = false;
          }
        }
      } catch (Exception ex){
        // throw exception
        scanner.nextLine();
      }
    }
    return n;
  }
  public static int getInt(int minValue , int maxValue){
    Scanner scanner = new Scanner(System.in);
    boolean valid = false;
    int n = 0;
    while (!valid){
      try {
        n = scanner.nextInt();
        if( n < minValue || n > maxValue){
          System.out.println("Invalid!");
        }else{
          valid = true;
        }
      } catch (Exception ex){
        // throw ex
        scanner.nextLine();
      }
    }
    return n;
  }

  public static int getInt(){
    Scanner scanner = new Scanner(System.in);
    boolean valid = false;
    int n = 0;
    while (!valid){
      try {
        n = scanner.nextInt();
        valid = true;
      } catch (Exception ex){
        // throw ex
        scanner.nextLine();
      }
    }
    return n;
  }
}
