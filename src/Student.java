import ultils.DateTimeUtils;

import java.util.Date;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/17/2023, Tuesday
 **/
public class Student {
  private long studentId;
  private String fullName;
  private String address;
  private String phoneNumber;
  private Date dateOfBirth;
  private Date enterDate;
  private Integer age;
  private Integer level;

  public Student() {
  }

  public Student(long studentId, String fullName, String address, String phoneNumber, Date dateOfBirth, Date enterDate) {
    this.studentId = studentId;
    this.fullName = fullName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.dateOfBirth = dateOfBirth;
    this.enterDate = enterDate;
  }

  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) { //fixme : return
    this.studentId = studentId;
  }

  public String getFullName() {
    return fullName;
  }

  public boolean setFullName(String fullName) {
    if (fullName != null && fullName.matches("^[a-zA-Z]*$")) {
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
    if (address != null) {
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
    if (phoneNumber != null && phoneNumber.length() == 7 && !phoneNumber.equals("") && phoneNumber.matches("[0-9]+")) {
      this.phoneNumber = phoneNumber;
      return true;
    } else {
      System.err.println("The phone number must have 7 digits !");
      System.out.println("Try again :");
      return false;
    }
  }

  public Integer getAge() {
    if (this.dateOfBirth != null) {
      int age = DateTimeUtils.getAge(this.dateOfBirth);
      return age < 0 ? null : age;
    }
    return null;
  }

  public Integer getLevel() {
    if (this.enterDate != null) {
      int age = DateTimeUtils.getAge(this.dateOfBirth);
      return age < 0 ? null : age;
    }
    return null;
  }

  public void inputInfo() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter student Id : ");
    while (true) {
      try {
        studentId = Long.parseLong(scanner.nextLine());
        break;
      } catch (Exception e) {
        System.err.println("ID includes only digits !");
        System.out.println("Try again :");
      }
    }

    System.out.println("Enter full name : ");
    while (true) {
      if (setFullName(scanner.nextLine()))
        break;
    }

    System.out.println("Enter address : "); //fixme : return
    while (true) {
      if (setAddress(scanner.nextLine()))
        break;
    }

    System.out.println("Enter phone number : ");
    while (true) {
      if (setPhoneNumber(scanner.nextLine()))
        break;
    }
  }

  public void showInfo() {
    System.err.println(toString());
  }

  @Override
  public String toString() {
    return "Student Id : " + studentId + " | " +
      "Name : " + fullName + " | " +
      "Address : " + address + " | " +
      "Phone Number : " + phoneNumber;
  }
}
