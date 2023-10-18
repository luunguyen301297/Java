package java1;

import java.util.Scanner;

public class CheckPassword {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0;

    while (count < 4) {
      System.out.println("Enter password:");
      String password = scanner.nextLine();

      boolean checkPassword = checkPassword(password);

      if (checkPassword) {
        System.out.println("Success !");
        break;
      }
      else {
        count++;
        System.out.println("Fail, " + (4 - count) + " tries left !");
        continue;
      }
    }
    if (count == 4) {
      System.out.println("Login is locked");
    }
  }

  public static boolean checkPassword(String password) {
    if (password.length() < 6)
      return false;

    boolean hasLetter = false;
    boolean hasNumber = false;
    boolean hasUppercase = false;
    boolean hasLowercase = false;

    for (char c : password.toCharArray()) {
      if (Character.isLetter(c)) {
        hasLetter = true;
        break;
      }
    }

    if (!hasLetter)
      return false;

    for (char c : password.toCharArray()) {
      if (Character.isDigit(c)) {
        hasNumber = true;
        break;
      }
    }

    if (!hasNumber)
      return false;

    for (char c : password.toCharArray()) {
      if (Character.isUpperCase(c)) {
        hasUppercase = true;
        break;
      }
    }

    if (!hasUppercase)
      return false;

    for (char c : password.toCharArray()) {
      if (Character.isLowerCase(c)) {
        hasLowercase = true;
        break;
      }
    }

    if (!hasLowercase)
      return false;

    return true;
  }
}
