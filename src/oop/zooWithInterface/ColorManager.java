package oop.zooWithInterface;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/24/2023, Tuesday
 **/
public class ColorManager {
  ArrayList<String> colorList = new ArrayList<>();

  public ColorManager() {
  }

  public void inputColor(ColorManager colorManager) {
    Scanner scanner =new Scanner(System.in);

    while (true) {
      System.out.println("Enter color to add");
      String color = scanner.nextLine();
      colorList.add(color);

      System.out.println("Continue entering or not ? (Y/N)");
      String choose = scanner.nextLine();
      if (choose.equalsIgnoreCase("n")) break;
    }
  }

  public void showColor() {
    colorList.forEach(System.out::println); //Lambda Jav8
  }

  public boolean checkColor(String color) {
    for (int i = 0; i < colorList.size(); i++) {
      if (colorList.get(i).equalsIgnoreCase(color)) return true;
    }
    return false;
  }
}
