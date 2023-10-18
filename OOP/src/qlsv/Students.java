package qlsv;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/28/2023, Thursday
 **/
public class Students extends Person{
  public Students(String name, String gender, String birthday, String address) {
    super(name, gender, birthday, address);
  }
  String studentId;
  float avgScore;
  String email;

  public Students(String name, String gender, String birthday, String address, String studentId, float avgScore, String email) {
    super(name, gender, birthday, address);
    this.studentId = studentId;
    this.avgScore = avgScore;
    this.email = email;
  }

  public Students() {
    super();
  }

  public String getStudentId() {
    return studentId;
  }

  public boolean setStudentId(String studentId) {
    if (studentId != null && studentId.length() == 6) {
      this.studentId = studentId;
      return true;
    } else {
      System.err.println("Re-enter!!!");
      return false;
    }
  }

  public float getAvgScore() {
    return avgScore;
  }

  public boolean setAvgScore(float avgScore) {
    if (avgScore >= 0 && avgScore <= 10) {
      this.avgScore = avgScore;
      return true;
    } else {
      System.err.println("Re-enter!!!");
      return false;
    }
  }

  public String getEmail() {
    return email;
  }

  public boolean setEmail(String email) {
    if (email != null && email.contains("@") && !email.contains(" ")) {
      this.email = email;
      return true;
    } else {
      System.out.println("Re-enter!!!");
      return false;
    }
  }

  @Override
  public void inputInfo() {
    super.inputInfo();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Student Id : ");
//    while (true) {
//      boolean check = setStudentId(scanner.nextLine());
//      if (check)
//        break;
//    }
    while (!setStudentId(scanner.nextLine()));

    System.out.println("Enter Avg Score : ");
    while (!setAvgScore(Float.parseFloat(scanner.nextLine())));

    System.out.println("Enter email : ");
    while (!setEmail(scanner.nextLine()));
  }

  @Override
  public void showInfo() {
    super.showInfo();
    System.out.print(" | " + "Student Id : " + studentId + " | " +
      "Avg Score : " + avgScore + " | " +
      "Email : " + email);
    System.out.println("");
  }

  public boolean checkScholarships() {
//    return avgScore >= 8;
    if (avgScore >= 8)
      return true;
    else
      return false;
  }
}
