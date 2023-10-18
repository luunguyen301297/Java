package qlbb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/22/2023, Friday
 **/
public class DurationTime {
  static List<Character> characterList = new ArrayList<>();
  static List<Integer> indexList = new ArrayList<>();
  String durationCode;
  int fromTime, toTime;
  int price;

  public DurationTime() {
  }

  public String getDurationCode() {
    return durationCode;
  }

  public void setDurationCode(String durationCode) {
    this.durationCode = durationCode;
  }

  public int getFromTime() {
    return fromTime;
  }

  public void setFromTime(int fromTime) {
    this.fromTime = fromTime;
  }

  public int getToTime() {
    return toTime;
  }

  public void setToTime(int toTime) {
    this.toTime = toTime;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);
    autoGenerateCode();

    System.out.println("Enter start time : ");
    fromTime = Integer.parseInt(scanner.nextLine());

    System.out.println("Enter start time : ");
    toTime = Integer.parseInt(scanner.nextLine());

    System.out.println("Enter price : ");
    price = Integer.parseInt(scanner.nextLine());
  }

  public void autoGenerateCode() {
    autoGenerateCharacter();

    durationCode = "";
    for (int i = 0; i < indexList.size(); i++) {
      int currentIndex = indexList.get(i);
      durationCode += String.valueOf(characterList.get(currentIndex));
    }

    int lasiIndex = indexList.size() - 1;
    indexList.set(lasiIndex, indexList.get(lasiIndex) + 1);

    for (int i = indexList.size() - 1; i > 0 ; i--) {
      if (indexList.get(i) < characterList.size()) {
        break;
      }
      indexList.set(i, 0);
      indexList.set(i - 1, indexList.get(i - 1) + 1);
    }
  }

  private static void autoGenerateCharacter() {
    if (characterList.size() > 0)
      return;

    //Khoi tao mang du lieu
    for (int i = (int)'0'; i < (int)'9'; i++) {
      characterList.add((char) i);
    }

    //save index tai thoi diem tiep theo se dc generate
    for (int i = 0; i < 2; i++) {
      indexList.add(0);
    }
  }
}
