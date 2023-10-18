package java1;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);

    while (true) {
      int m = 0;
      System.out.println("Nhap n: ");
      n = scanner.nextInt();

      while (n <= 0) {
        System.out.println("Nhap n (n > 0) : ");
        n = scanner.nextInt();
      }
      for (int i = 1; i <= n; i++) {
        if (n % i == 0)
          m++;
      }
      if (m == 2)
        System.out.println(n + " la snt");
      else
        System.out.println(n + " khong phai la snt");

      System.out.println("Tiep tuc ? (Y/N)");
      String choose = new Scanner(System.in).nextLine();
      if (choose.equals("n") || choose.equals("N"))
        break;
      else continue;
    }
  }
}
