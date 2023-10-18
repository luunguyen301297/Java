package java1;

import ultils.ConsoleUtils;

import java.util.Arrays;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/14/2023, Saturday
 **/
public class ArrayLab {
  public static void main(String[] args) {
    System.err.println("Enter m :");
    int m = ConsoleUtils.getInt(Integer.valueOf(0), null);
    System.err.println("Enter n :");
    int n = ConsoleUtils.getInt(Integer.valueOf(0), null);

    int[] arr1 = new int[m];
    int[] arr2 = new int[n];

    for (int i = 0; i < m; i++) {
      System.err.println("Enter arr1[" + i + "]");
      int num = ConsoleUtils.getInt();
      arr1[i] = num;
    }

    for (int i = 0; i < n; i++) {
      System.err.println("Enter arr2[" + i + "]");
      int num = ConsoleUtils.getInt();
      arr2[i] = num;
    }

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    int[] arr3 = new int[m+n];
    System.arraycopy(arr1, 0, arr3, 0, m);
    System.arraycopy(arr2, 0, arr3, m, n);

    Arrays.sort(arr3);

    System.err.println("Array :");
    for (int num : arr3) {
      System.out.println(num);
    }

    int index = Arrays.binarySearch(arr3, 20);
    if (index < 0) {
      // no
    } else {
      //yes
    }
  }
}
