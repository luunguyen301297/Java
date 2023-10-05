package Java1;

import java.util.Scanner;

public class OptimalString {
  public static void main(String[] args) {
    //vd: "  WiBU   at  tHE cOre    oF the  eArTh    "
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter str:");
    String input = scanner.nextLine();
    System.out.println("Otm str: " + optimalString(input));
  }

  public static String optimalString(String input) {
    input = input.trim();
    String[] arr = input.split("\\s+");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i].toLowerCase();
      String firstChar = arr[i].substring(0, 1);
      firstChar = firstChar.toUpperCase();
      arr[i] = firstChar + arr[i].substring(1);
    }
    return String.join(" ", arr);
  }
}
