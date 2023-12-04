package oop.Lab8;

import ultils.DateTimeUtils;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/17/2023, Tuesday
 **/
public class Student implements ILevel{
  private long studentId;
  private String fullName, address, phoneNumber;
  private LocalDate dateOfBirth, enrollDate;
  private Integer age;
  private LEVEL level;

  public Student() {
  }

  public Student(long studentId, String fullName, String address, String phoneNumber, LocalDate dateOfBirth, LocalDate enrollDate) {
    this.studentId = studentId;
    this.fullName = fullName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.dateOfBirth = dateOfBirth;
    this.enrollDate = enrollDate;
  }

  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }

  public String getFullName() {
    return fullName;
  }

  public boolean setFullName(String fullName) {
    if (fullName != "" && fullName.matches("^[a-zA-Z]*$")) {
      this.fullName = fullName;
      return true;
    } else {
      System.err.println("Incorrect name format");
      System.out.println("Try again :");
      return false;
    }
  }

  public String getAddress() {
    return address;
  }

  public boolean setAddress(String address) {
    if (address != "" && address.matches("^[0-9a-zA-Z]*$")) {
      this.address = address;
      return true;
    } else {
      System.err.println("Incorrect address format");
      System.out.println("Try again :");
      return false;
    }
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public boolean setPhoneNumber(String phoneNumber) {
    if (phoneNumber != null && phoneNumber.length() == 7 && phoneNumber.matches("[0-9]+")) {
      this.phoneNumber = phoneNumber;
      return true;
    } else {
      System.err.println("The phone number must have 7 digits !");
      System.out.println("Try again :");
      return false;
    }
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public LocalDate getEnrollDate() {
    return enrollDate;
  }

  public void setEnrollDate(LocalDate enrollDate) {
    this.enrollDate = enrollDate;
  }

  public Integer getAge() {
    if (this.dateOfBirth != null) {
      age = DateTimeUtils.getAge(dateOfBirth);
      return age < 0 ? null : age;
    }
    return null;
  }

  public LEVEL getLevel() {
    if (this.enrollDate != null) {
      level = getLevel(enrollDate);
    }
    return level;
  }

  public void inputInfo() throws ParseException {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter student Id : ");
    while (true) {
      try {
        studentId = Long.parseLong(scanner.nextLine());
        break;
      } catch (NumberFormatException e) {
        System.err.println(e.getMessage() + " / ID includes only digits !");
        System.out.println("Try again :");
      }
    }

    System.out.println("Enter full name : ");
    while (true) {
      if (setFullName(scanner.nextLine()))
        break;
    }

    System.out.println("Enter address : ");
    while (true) {
      if (setAddress(scanner.nextLine()))
        break;
    }

    System.out.println("Enter phone number : ");
    while (true) {
      if (setPhoneNumber(scanner.nextLine()))
        break;
    }

    System.out.println("Enter date of birth (format : yyyy-MM-dd) : ");
    LocalDate dayNow = LocalDate.now();
    while (true) {
      try {
        dateOfBirth = LocalDate.parse(scanner.nextLine());
        if (dateOfBirth.isBefore(dayNow) && dateOfBirth.getYear() > 1800) {
          break;
        } else {
          System.err.println("Are you using a time machine ?");
          System.out.println("Try again :");
        }
      } catch (Exception e) {
        System.err.println(e.getMessage() + " / Incorrect date format !");
        System.out.println("Try again :");
      }
    }

    System.out.println("Enter enroll date (format : yyyy-MM-dd) : ");
    while (true) {
      try {
        enrollDate = LocalDate.parse(scanner.nextLine());
        if (enrollDate.isBefore(dayNow) && enrollDate.isAfter(dateOfBirth)) {
          break;
        } else {
          System.err.println("Are you using a time machine ?");
          System.out.println("Try again :");
        }
      } catch (Exception e) {
        System.err.println(e.getMessage() + " / Incorrect date format !");
        System.out.println("Try again :");
      }
    }

    getAge();
    getLevel();
  }

  public void showInfo() {
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "Student : " +
      "studentId = " + studentId +
      ", fullName = " + fullName +
      ", address = " + address +
      ", phoneNumber = " + phoneNumber +
      ", dateOfBirth = " + dateOfBirth +
      ", enterDate = " + enrollDate +
      ", age = " + age +
      ", level = " + level;
  }

  @Override
  public void showLevel() {
    onLevel();
  }
}
