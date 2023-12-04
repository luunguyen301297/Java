package oop.qlsv;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/28/2023, Thursday
 **/
public class Person {
  String name;
  String gender;
  String birthday;
  String address;

  public Person(String name, String gender, String birthday, String address) {
    this.name = name;
    this.gender = gender;
    this.birthday = birthday;
    this.address = address;
  }

  public Person() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void inputInfo() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter name : ");
    name = scanner.nextLine();

    System.out.println("Enter gender : ");
    gender = scanner.nextLine();

    System.out.println("Enter birthday : ");
    birthday = scanner.nextLine();

    System.out.println("Enter address : ");
    address = scanner.nextLine();
  }

  public void showInfo() {
    System.out.print("Name : " + name + " | " +
      "Gender : " + gender + " | " +
      "Birthday : " + birthday + " | " +
      "Address : " + address);
  }
}
