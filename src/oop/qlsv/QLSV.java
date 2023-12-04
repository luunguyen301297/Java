package oop.qlsv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/28/2023, Thursday
 **/
public class QLSV {
  public static void main(String[] args) {
    ArrayList<Students> studentList = new ArrayList<>();
    int choose;
    Scanner scanner = new Scanner(System.in);

    do {
      showMenu();
      System.out.println("Choose : ");
      choose = Integer.parseInt(scanner.nextLine());

      switch (choose) {
        case 1:
          int n;
          System.out.println("Enter the number of students needed :");
          n = Integer.parseInt(scanner.nextLine());
          for (int i = 0; i < n; i++) {
            Students student = new Students();
            student.inputInfo();
            studentList.add(student);
          }
          break;

        case 2:
          for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).showInfo();
          }
          break;

        case 3:
          int minIndex = 0, maxIndex = 0;
          float minAvgScore, maxAvgScore;
          minAvgScore = studentList.get(0).getAvgScore();
          maxAvgScore = studentList.get(0).getAvgScore();

          for (int i = 1; i < studentList.size(); i++) {
            if (studentList.get(i).getAvgScore() < minAvgScore) {
              minIndex = i;
              minAvgScore = studentList.get(i).getAvgScore();
            }

            if (studentList.get(i).getAvgScore() > maxAvgScore) {
              maxIndex = i;
              maxAvgScore = studentList.get(i).getAvgScore();
            }
          }

          System.out.println("Lab8.Student have maxAvgScore :");
          studentList.get(maxIndex).showInfo();

          System.out.println("Lab8.Student have minAvgScore :");
          studentList.get(minIndex).showInfo();
          break;

        case 4:
          System.out.println("Enter Lab8.Student Id :");
          String searchStudentId = scanner.nextLine();
          int count = 0;

          for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId().equals(searchStudentId)) {
              studentList.get(i).showInfo();
              count++;
            }
          }

          if (count == 0) {
            System.err.println("Can't find Id!!!");
          }
          break;

        case 5:
          Collections.sort(studentList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
              int compare = o1.getName().compareTo(o2.getName());
              if (compare >= 0) {
                return 1;
              } else {
                return -1;
              }
            }
          });

          for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).showInfo();
          }
          break;

        case 6:
          Collections.sort(studentList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
              return o1.getAvgScore() >= o2.getAvgScore() ? -1 : 1;
            }
          });

          for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).checkScholarships()) {
              studentList.get(i).showInfo();
            }
          }
          break;

        case 7:
          System.out.println("Goodbye!!!");
          break;
        default:
          System.err.println("404");
          break;
      }
    } while (choose != 7);
  }

  static void showMenu() {
    System.out.println("1. Enter Lab8.Student");
    System.out.println("2. Display Lab8.Student Info");
    System.out.println("3. Display MAX/MIN avgScore");
    System.out.println("4. Search Lab8.Student by ID");
    System.out.println("5. Display All Lab8.Student & Sort name A-Z");
    System.out.println("6. Display All Lab8.Student have scholarships & Sort avgScore Max-Min");
    System.out.println("7. Exit");
  }
}
