package oop.zooWithInterface;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/24/2023, Tuesday
 **/
public class CatDetail implements ICat{
  String type, color, address;

  public CatDetail() {
  }

  public CatDetail(String type, String color, String address) {
    this.type = type;
    this.color = color;
    this.address = address;
  }

  @Override
  public void inputInfo() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter type :");
    type = scanner.nextLine();
    System.out.println("Enter address :");
    address = scanner.nextLine();
  }

  public void inputInfo(ColorManager colorManager) {
    inputInfo();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter color :");

    while (true) {
      color = scanner.nextLine();
      if (colorManager.checkColor(color)) {
        break;
      } else {
        System.err.println("That color already exists");
      }
    }
  }

  @Override
  public void showInfo() {
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "CatDetail{" +
      "name='" + NAME + '\'' +
      "type='" + type + '\'' +
      ", color='" + color + '\'' +
      ", address='" + address + '\'' +
      '}';
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
