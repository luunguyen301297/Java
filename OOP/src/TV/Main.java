package TV;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/3/2023, Tuesday
 **/
public class Main {
  public static void main(String[] args) {
    CTivi cTivi;
    int choose;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Choose init TV");
    System.out.println("1. Standard");
    System.out.println("2. Choose Channel");
    System.out.println("Choose");
    choose = Integer.parseInt(scanner.nextLine());
    if (choose == 1) {
      cTivi = new CTivi();
    } else {
      System.out.println("Enter num of channel :");
      int n = Integer.parseInt(scanner.nextLine());
      String[] channel = new String[n];

      for (int i = 0; i < n; i++) {
        System.out.println("Enter channel : " + (i + 1));
        channel[i] = scanner.nextLine();
      }
      cTivi = new CTivi(channel);
    }

    do {
      showMenu();
      choose = Integer.parseInt(scanner.nextLine());

      switch (choose) {
        case 1:
          cTivi.Switch();
          break;
        case 2:
          System.out.println("Enter channel");
          String setChannel = scanner.nextLine();
          cTivi.Switch(setChannel);
          break;
        case 3:
          cTivi.On();
          break;
        case 4:
          cTivi.Off();
          break;
        case 5:
          cTivi.nextChannel();
          break;
        case 6:
          cTivi.previousChannel();
          break;
        case 7:
          cTivi.show();
          break;
        case 8:
          System.out.println("Exit");
          break;
        default:
          System.out.println("Fail");
      }
    } while (choose != 8);
  }

  public static void showMenu() {
    System.out.println("------------------");
    System.out.println("1. Switch");
    System.out.println("2. Switch by Channel");
    System.out.println("3. ON TV");
    System.out.println("4. OFF TV");
    System.out.println("5. Next Channel");
    System.out.println("6. Prev Channel");
    System.out.println("7. Show Info");
    System.out.println("8. Exit");
    System.out.println("Choose :");
  }
}
