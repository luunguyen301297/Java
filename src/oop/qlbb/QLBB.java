package oop.qlbb;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/14/2023, Thursday
 **/
public class QLBB {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int choose;

    do {
      showMenu();
      choose = Integer.parseInt(scanner.nextLine());

      switch (choose) {
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          break;
        case 6:
          System.out.println("Exit !");
          break;
        default:
          System.out.println("Input failed !");
          break;

      }
    } while (choose != 6);
  }

  public static void showMenu() {
    System.out.println("1. Add swimming pool");
    System.out.println("2. Add monthly ticket");
    System.out.println("3. Checkin");
    System.out.println("4. Statistic profit of month by daily ticket");
    System.out.println("5. Statistic profit of month");
    System.out.println("6. Exit");
    System.out.println("7. Choose");
  }
}
