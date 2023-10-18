package cinema;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/30/2023, Saturday
 **/
public class Room extends Area{
  //Tong so ghe trong room
  int total;
  //so ghe da co nguoi dat
  int num;

  public Room() {
    super("Phong chieu phim");
  }

  public Room(int total, int num) {
    super("Phong chieu phim");
    this.total = total;
    this.num = num;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  @Override
  public void input() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap tong so ghe :");
    total = scanner.nextInt();

    System.out.println("Nhap so ghe da ngoi");
    num = scanner.nextInt();

    setupStatus();
  }

  public void setupStatus() {
    if (num == 0) {
      status = STATUS.EMPTY;
    } else {
      float percent = ((float) num * 100) / total;

      if (percent >= 75) {
        status = STATUS.FULL;
      } else if (percent >= 25) {
        status = STATUS.NORMAL;
      } else {
        status = STATUS.LESS;
      }
    }
    autoCurrentTime();
  }
}
