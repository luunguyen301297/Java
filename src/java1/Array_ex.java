package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_ex {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter arr length:");

    int n = scanner.nextInt();
    int[] str = new int[n];
    int sum = 0;

    for (int i = 0; i < n; i++) {
      System.out.println("Enter Arr[" + i + "] :");
      str[i] = scanner.nextInt();

      if (str[i] % 2 == 0)
        sum += str[i];
    }

    Arrays.sort(str);
    System.out.println("Array: " + Arrays.toString(str));
    System.out.println("Sum arr[i] % 2 = " + sum);

    for (int i = 0, j = str.length - 1; i < j; i++, j--) {
      int temp = str[i];
      str[i] = str[j];
      str[j] = temp;
    }
    System.out.println("Array 2: " + Arrays.toString(str));

    System.out.println("Enter check value:");
    int x = scanner.nextInt();
    boolean check = false;
    int index = 0;

    for (int i = 0; i < n; i++) {
      if (str[i] == x) {
        check = true;
        index += i;
      }
    }

    if (check)
      System.out.println("Yes\nPosition: " + index);
    else
      System.out.println("No");
  }
}
