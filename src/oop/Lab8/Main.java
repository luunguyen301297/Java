package oop.Lab8;

import java.text.ParseException;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/17/2023, Tuesday
 **/
public class Main {
  public static void main(String[] args) throws ParseException {
    StudentManager studentManager = StudentManager.getInstance();
    int choose;
    Scanner scanner = new Scanner(System.in);

    do {
      showMenu();
      System.out.println("Please choose the action : ");
      while (true) {
        try {
          choose = Integer.parseInt(scanner.nextLine());
          break;
        } catch (NumberFormatException e) {
          System.err.println(e.getMessage() + " / selection includes only digits !");
          System.out.println("Try again :");
        }
      }

      switch (choose) {
        case 1: //todo: add students
          studentManager.inputStudentManager();
          break;
        case 2: //todo: show students
          studentManager.showStudentManager();
          break;
        case 3: //todo: sort list
          studentManager.sortStudentManager();
          break;
        case 4: //todo: delete students
          studentManager.deleteStudentManager();
          break;
        case 5: //todo: edit information
          studentManager.editStudentById();
          break;
        case 6: //todo: show on the list of students of the same age
          studentManager.showStudentSameAgeManager();
          break;
        case 7: //todo: show the list of students entering the same year
          studentManager.showStudentSameEnrollManager();
          break;
        case 8: //todo: Save student information to txt file
          studentManager.createAndWriteToFiles();
          break;
        case 9: //todo: Exit & save data
          System.out.println("Do you want to save student information before exiting the program ? (Y/N)");
          if (scanner.nextLine().equalsIgnoreCase("y")) {
            studentManager.createAndWriteToFiles();
          } else {
            System.out.println("Exit the program !");
          }
          break;
        default:
          System.err.println("Please choose the right key");
      }
    } while (choose != 9);
  }

  public static void showMenu() {
    System.out.println("----------------------------------");
    System.out.println("1. Add student");
    System.out.println("2. Show all student");
    System.out.println("3. Sort student list");
    System.out.println("4. Delete student");
    System.out.println("5. Edit student information");
    System.out.println("6. Show on the list of students of the same age");
    System.out.println("7. Show the list of students entering the same year");
    System.out.println("8. Save student information to txt file");
    System.out.println("9. Exit & Save");
    System.out.println("----------------------------------");
  }
}
