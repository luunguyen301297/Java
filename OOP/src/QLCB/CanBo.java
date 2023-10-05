package QLCB;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/8/2023, Friday
 **/
public class CanBo {
  private String name;
  private String birthday;
  private String gender;
  private String address;

  public CanBo() {
  }

  public CanBo(String name, String birthday, String gender, String address) {
    this.name = name;
    this.birthday = birthday;
    this.gender = gender;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Name: " + name + " | " +
      "Birthday: " + birthday + " | " +
      "Gender: " + gender + " | " +
      "Address: " + address;
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nhap ten:");
    name = scanner.nextLine();
    System.out.println("Nhap ngay sinh:");
    birthday = scanner.nextLine();
    System.out.println("Nhap gioi tinh:");
    gender = scanner.nextLine();
    System.out.println("Nhap dia chi:");
    address = scanner.nextLine();
  }

  public void display() {
    System.out.println(this);
  }
}
