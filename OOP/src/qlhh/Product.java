package qlhh;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/14/2023, Thursday
 **/
public class Product {
  private String id;
  private String name;
  private int quantity;
  private double price;

  public Product() {
  }

  public Product(String id, String name, int quantity, double price) {
    this.id = id;
    this.name = name;
    this.quantity = quantity;
    this.price = price;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "id : " + id + " | " +
      "name : " + name + " | " +
      "quantity : " + quantity + " | " +
      "price : " + price;
  }

  public void display() {
    System.out.println(toString());
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter id : ");
    id = scanner.nextLine();

    System.out.println("Enter name : ");
    name = scanner.nextLine();

    System.out.println("Enter quantity : ");
    quantity = Integer.parseInt(scanner.nextLine());

    System.out.println("Enter price : ");
    price = Float.parseFloat(scanner.nextLine());
  }
}
