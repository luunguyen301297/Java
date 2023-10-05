package Java1;

import java.util.Scanner;

public class SeparateNumberAndCharFromStr {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter string:");
    String input = scanner.nextLine();

    StringBuilder txt = new StringBuilder();
    StringBuilder num = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      if (Character.isLetter(c))
        txt.append(c);
      else if (Character.isDigit(c))
        num.append(c);
    }
    System.out.println("String text: " + txt);
    System.out.println("String number: " + num);
  }
}
