package java1;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/7/2023, Saturday
 **/
public class HanoiTower {
  static void tower(int N, int a, int b, int c)
  {
    if(N == 1)
    {
      System.out.println(a + " - > " + c);
      return;
    }

    tower(N - 1, a, c, b); // Chuyển N - 1 đĩa từ cọc 1 sang cọc 2, cọc 3 là trung gian.
    tower(1, a, b, c); // Chuyển 1 đĩa còn lại từ cọc 1 sang cọc 3.
    tower(N - 1, b, a, c); // Chuyển N - 1 đĩa từ cọc 2 sang cọc 3, cọc 1 là trung gian.
  }

  public static void main(String[] args) {
    int N;
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    int a = 1, b = 2, c = 3;
    tower(N, a, b, c); // Giải bài toán với N đĩa.
  }
}
