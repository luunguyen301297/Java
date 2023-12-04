package algorithms;

import java.util.Scanner;

public class ConvertString {
  public static void main(String[] args) {
    String s1 = "abcxyz";
    String s2 = "123456";
    String input;
    String output = "";
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter string");
    input = scanner.nextLine();

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      int index = s1.indexOf(c);

      if (index == -1) {
          output += c;
      }
      else
        output += s2.charAt(index);
    }
    System.out.println(output);
  }
}
