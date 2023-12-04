package oop.qlbb;

import java.util.Date;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/22/2023, Friday
 **/
public class MonthTicket extends Ticket{
  String customerName;
  String address;
  String avatar;
  Date expiredDate;
  int price;

  public MonthTicket() {
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Date getExpiredDate() {
    return expiredDate;
  }

  public void setExpiredDate(Date expiredDate) {
    this.expiredDate = expiredDate;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public void input() {
    super.input();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter customer name : ");
    customerName = scanner.nextLine();

    System.out.println("Enter customer address : ");
    address = scanner.nextLine();

    System.out.println("Enter customer avatar : ");
    avatar = scanner.nextLine();

    System.out.println("Enter price : ");
    price = Integer.parseInt(scanner.nextLine());

    System.out.println("Enter resgistered date (dd/MM/yyyy) : ");
    String expiredDateStr = scanner.nextLine();
    expiredDate = convertStringToDate(expiredDateStr);
  }
}
