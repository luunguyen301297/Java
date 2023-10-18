import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/17/2023, Tuesday
 **/
public class Main {
  // enter value
  // 1. add student
  // 2. show student
  // 3. sort list
  // 4. delete student
  // 5. edit student
  // 6. exit

  public static void main(String[] args) {
    ArrayList<Student> studentList = new ArrayList<>();
    int choose;
    Scanner scanner = new Scanner(System.in);

    do {
      showMenu();
      System.out.println("Please choose the action : ");
      choose = Integer.parseInt(scanner.nextLine());

      switch (choose) {
        case 1:
          int n;
          System.out.println("Enter the number of students you need to add :");
          n = Integer.parseInt(scanner.nextLine());
          for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.inputInfo();
            studentList.add(student);
          }
          break;

        case 2:
          if (studentList.isEmpty()) {
            System.err.println("There are no students on the list !");
          } else {
            for (int i = 0; i < studentList.size(); i++) {
              studentList.get(i).showInfo();
            }
            break;
          }

        case 3:
          System.out.println("Sort by...?");
          System.out.println("1. ID");
          System.out.println("2. Name");
          if (studentList.isEmpty()) {
            System.err.println("There are no students on the list !");
          } else {
            switch (Integer.parseInt(scanner.nextLine())) {
              case 1:
                studentList.sort(Comparator.comparing(Student::getStudentId));
                break;
              case 2:
                studentList.sort(Comparator.comparing(Student::getFullName));
                break;
            }

            for (int i = 0; i < studentList.size(); i++) {
              studentList.get(i).showInfo();
            }
            break;
          }

        case 4:
          System.out.println("Enter the student ID to delete :");
          long searchById = Long.parseLong(scanner.nextLine());
          int count = 0;

          for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == searchById) {
              studentList.remove(studentList.get(i));
              System.err.println("Student has been successfully deleted !");
              count++;
            }
          }

          if (count == 0) {
            System.err.println("Can't find student with ID = " + searchById);
          }
          break;

        case 5:
          System.out.println("Enter the student ID that needs to edit information : ");
          searchById = Long.parseLong(scanner.nextLine());
          count = 0;

          for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == searchById) {
              System.out.println("Enter new ID :");
              studentList.get(i).setStudentId(Long.parseLong(scanner.nextLine()));

              System.out.println("Enter new fullname :");
              studentList.get(i).setFullName(scanner.nextLine());

              System.out.println("Enter new address :");
              studentList.get(i).setAddress(scanner.nextLine());

              System.out.println("Enter new phone number :");
              studentList.get(i).setPhoneNumber(scanner.nextLine());

              System.err.println("Student information has been updated !");
              count++;
            }
          }

          if (count == 0) {
            System.err.println("Can't find student with ID = " + searchById);
          }
          break;

        case 6:
          System.err.println("Exit the program !");
          break;

        default:
          System.err.println("Please choose the right key");
      }
    } while (choose != 6);
  }

  public static void showMenu() {
    System.out.println("----------------------------------");
    System.out.println("1. Add student");
    System.out.println("2. Show all student");
    System.out.println("3. Sort student list");
    System.out.println("4. Delete student");
    System.out.println("5. Edit student information");
    System.out.println("6. Exit");
    System.out.println("----------------------------------");
  }
}
