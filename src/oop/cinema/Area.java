package oop.cinema;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/30/2023, Saturday
**/
public class Area implements IStatus{
  static enum STATUS {
    EMPTY, LESS, NORMAL, FULL
  }
  STATUS status;
  String currentTime;
  String name;

  public Area() {
    currentTime = "";
    status = STATUS.EMPTY;
  }

  public Area(String name) {
    this.name = name;
    currentTime = "";
    status = STATUS.EMPTY;
  }

  public Area(STATUS status, String currentTime, String name) {
    this.status = status;
    this.currentTime = currentTime;
    this.name = name;
  }

  public STATUS getStatus() {
    return status;
  }

  public void setStatus(STATUS status) {
    autoCurrentTime();
    this.status = status;
  }

  public void autoCurrentTime() {
    SimpleDateFormat format = new SimpleDateFormat("H:m:s dd:mm:yyyy");
    Date time = new Date();
    currentTime = format.format(time);
  }

  public String getCurrentTime() {
    return currentTime;
  }

  public void setCurrentTime(String currentTime) {
    this.currentTime = currentTime;
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("0. Empty");
    System.out.println("1. Less");
    System.out.println("2. Normal");
    System.out.println("3. Full");
    System.out.println("Choose :");

    int option = scanner.nextInt();

    switch (option) {
      case 0:
        setStatus(STATUS.EMPTY);
        break;
      case 1:
        setStatus(STATUS.LESS);
        break;
      case 2:
        setStatus(STATUS.NORMAL);
        break;
      default:
        setStatus(STATUS.FULL);
        break;
    }
  }

  @Override
  public void onStatus() {
    switch (status) {
      case EMPTY:
        System.out.println(name + " dang trong");
        break;
      case LESS:
        System.out.println(name + " dang it khach");
        break;
      case NORMAL:
        System.out.println(name + " vua du khach");
        break;
      case FULL:
        System.out.println(name + " dang dong khach");
        break;
    }
  }
}
