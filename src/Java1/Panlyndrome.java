package Java1;

import java.util.Scanner;

public class Panlyndrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter string:");
    String str = scanner.nextLine();
    String[] arr = str.split("");

    for (int i = 0; i < arr.length; i++) {
      for (int j = arr.length - 1; j >= 0; j--) {
        if (arr[i].equals(arr[j]))
          System.out.println("Yes");
        else
          System.out.println("No");
        break;
      }
      break;
    }

    //reverse
    String strReverse = new StringBuilder(str).reverse().toString();
    if (str.equals(strReverse))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
