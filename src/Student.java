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

  public Student() {
  }

  public Student(long studentId, String fullName, String address, String phoneNumber) {
    this.studentId = studentId;
    this.fullName = fullName;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public long getStudentId() {
    return studentId;
  }

  public boolean setStudentId(long studentId) { //fixme : return
    try {
      this.studentId = studentId;
      return true;
    } catch (Exception e) {
      System.err.println("ID includes only digits !");
      System.out.println("Try again :");
      return false;
    }
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

  public void inputInfo() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter student Id : ");
    while (true) {
      if (setStudentId(Long.parseLong(scanner.nextLine())))
        break;
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
