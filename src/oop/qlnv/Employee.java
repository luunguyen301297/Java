package oop.qlnv;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/8/2023, Friday
 **/
public class Employee {
  private String name;
  private String gender;
  private String address;
  private String position;
  private double salary;

  public Employee() {
  }

  public Employee(String name, String gender, String address, String position, double salary) {
    this.name = name;
    this.gender = gender;
    this.address = address;
    this.position = position;
    this.salary = salary;
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter name: ");
    name = scanner.nextLine();

    System.out.println("Choose gender: ");
    System.out.println("1. Male");
    System.out.println("2. Female");

    while (true) {
      gender = scanner.nextLine();

      if (gender.equals("1")) {
        gender = "Male";
        break;
      }
      else if (gender.equals("2")) {
        gender = "Female";
        break;
      }
      else {
        System.out.println("Wrong data, re-enter !");
        System.out.println("Please choose 1 or 2");
      }
    }

    System.out.println("Enter address: ");
    address = scanner.nextLine();

    System.out.println("Enter position: ");
    position = scanner.nextLine();

    System.out.println("Enter salary: ");
    while (true) {
      salary = Double.parseDouble(scanner.nextLine());

      if (salary < 0) {
        System.out.println("Wrong data, re-enter !");
        System.out.println("Enter salary: ");
        continue;
      }
      else {
        this.salary = salary;
        break;
      }
    }
  }

  public void display() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "Name: " + name + " | " +
      "Gender: " + gender + " | " +
      "Address: " + address + " | " +
      "Position: " + position + " | " +
      "Salary: " + salary;
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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
