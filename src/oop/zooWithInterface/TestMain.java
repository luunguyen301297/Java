package oop.zooWithInterface;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/24/2023, Tuesday
 **/
public class TestMain {
  public static void main(String[] args) {
    CatManager catManager = new CatManager();

    ColorManager colorManager = new ColorManager();
    int choose;
    Scanner scanner = new Scanner(System.in);

    do {
      showMenu();
      choose = Integer.parseInt(scanner.nextLine());

      switch (choose) {
        case 1:
          catManager.inputManager(colorManager);
          break;
        case 2:
          catManager.display();
          break;
        case 3:
          colorManager.inputColor(colorManager);
          break;
        case 4:
          catManager.sortByColor();
          break;
        case 5:
          catManager.findByType();
          break;
        case 6:
          System.out.println("Exit program");
          break;
        default:
          System.err.println("Err case");
          break;
      }
    } while (choose !=6);
  }

  static void showMenu() {
    System.out.println("1. Enter cat detail");
    System.out.println("2. Show info");
    System.out.println("3. Enter color list");
    System.out.println("4. Sort by color");
    System.out.println("5. Sort by type");
    System.out.println("6. Exit");
    System.err.println("Choose");
  }
}
