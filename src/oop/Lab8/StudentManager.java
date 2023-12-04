package oop.Lab8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/24/2023, Tuesday
 **/
public class StudentManager {
  ArrayList<Student> studentList;

  private StudentManager() {
    studentList = new ArrayList<>();
  }

  public static StudentManager instance = null;

  public static StudentManager getInstance() {
    if (instance == null) instance = new StudentManager();
    return instance;
  }

  public void inputStudentManager() throws ParseException {
    Scanner scanner = new Scanner(System.in);
    int n = 0;
    System.out.println("Enter the number of students you need to add :");

    while (true) {
      try {
        n = Integer.parseInt(scanner.nextLine());
        break;
      } catch (NumberFormatException e) {
        System.err.println(e.getMessage() + " / The number of students must be a number !");
        System.out.println("Try again :");
      }
    }

    int count = 1;

    for (int i = 0; i < n; i++) {
      Student student = new Student();
      System.err.println("Enter student " + count + " information >>>");
      student.inputInfo();
      studentList.add(student);
      count++;
    }
  }

  public void showStudentManager() {
    if (studentList.isEmpty()) {
      System.err.println("There are no students on the list !");
    } else {
      System.out.println("List students :");
      studentList.forEach(System.err::println);
    }
  }

  public void sortStudentManager() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Sort student list by...?");
    System.out.println("1. ID");
    System.out.println("2. Name");

    if (studentList.isEmpty()) {
      System.err.println("There are no students on the list !");
    } else {
      switch (Integer.parseInt(scanner.nextLine())) {
        case 1:
          studentList.sort(Comparator.comparing(Student::getStudentId));  //Java 8 sort with Comparator
          break;
        case 2:
          studentList.sort(Comparator.comparing(Student::getFullName));
          break;
      }

      System.out.println("List of students after being sorted :");
      studentList.forEach(System.err::println);
    }
  }

  public void deleteStudentManager() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the student ID to delete :");
    long searchById = Long.parseLong(scanner.nextLine());
    int count = 0;

    for (int i = 0; i < studentList.size(); i++) {
      if (studentList.get(i).getStudentId() == searchById) {
        studentList.remove(studentList.get(i));
        System.err.println("Lab8.Student has been successfully deleted !");
        count++;
      }
    }

    if (count == 0) {
      System.err.println("Can't find student with ID = " + searchById);
    }
  }

  public void editStudentById() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the student ID that needs to edit information : ");
    long searchById = Long.parseLong(scanner.nextLine());
    int count = 0;

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

        System.err.println("Lab8.Student information has been updated !");
        count++;
      }
    }

    if (count == 0) {
      System.err.println("Can't find student with ID = " + searchById);
    }
  }

  public void showStudentSameAgeManager() {
    if (studentList.isEmpty()) {
      System.err.println("There are no students on the list !");
    } else {
      System.out.println("List of students of the same age :");
      for (int i = 0; i < studentList.size(); i++) {
        for (int j = i + 1; j < studentList.size(); j++) {
          if (studentList.get(i).getDateOfBirth().getYear() == studentList.get(j).getDateOfBirth().getYear()) {
            System.err.println(studentList.get(i));
            System.err.println(studentList.get(j));
          }
        }
      }
    }
  }

  public void showStudentSameEnrollManager() {
    if (studentList.isEmpty()) {
      System.err.println("There are no students on the list !");
    } else {
      System.out.println("List of students of the same age :");
      for (int i = 0; i < studentList.size(); i++) {
        for (int j = i + 1; j < studentList.size(); j++) {
          if (studentList.get(i).getEnrollDate().getYear() == studentList.get(j).getEnrollDate().getYear()) {
            System.err.println(studentList.get(i));
            System.err.println(studentList.get(j));
          }
        }
      }
    }
  }

  public void writeToFile(String path) {
    try {
      FileWriter myWriter = new FileWriter(path, true);
      for (int i = 0; i < studentList.size(); i++) {
        myWriter.write(studentList.get(i).toString() + "\n");
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file !");
    } catch (IOException e) {
      System.err.println(e.getMessage() + " / An error occurred !");
    }
  }

  public void createAndWriteToFiles() {
    String path = "C:\\Users\\ad\\Desktop\\Students.txt";
    try{
      File newFile = new File(path);
      if(!newFile.exists()){
        newFile.createNewFile();
        writeToFile(path);
        System.out.println("File was created with path : " + path);
      } else {
        System.err.println("File already exists ! Do you want to write data to file ? (Y/N) : ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equalsIgnoreCase("y")) {
          writeToFile(path);
        } else {
          System.out.println("Exit the program !");
        }
      }
    }catch(IOException e){
      System.out.println(e.getMessage() + " / An error occurred !");
    }
  }
}
