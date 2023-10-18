package java2;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/27/2023, Wednesday
 **/
public class Exception_ex {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[3];

    try {
      for (int i = 0; i <= arr.length; i++) {
        System.out.println("Enter arr[" + i + "] : ");
        arr[i] = scanner.nextInt();
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("Finish");
    }

    System.out.println("arr list : ");
    for (int part : arr) {
      System.out.println(part);
    }
  }
}
