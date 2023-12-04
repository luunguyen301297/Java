package oop.qlcb;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/8/2023, Friday
 **/
public class KySu extends CanBo{
  protected String branch;

  public KySu() {
  }

  public KySu(String name, String birthday, String gender, String address, String branch) {
    super(name, birthday, gender, address);
    this.branch = branch;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  @Override
  public String toString() {
    return super.toString() + " | Branch: " + branch;
  }

  @Override
  public void input() {
    super.input();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap chuyen nganh:");
    branch = scanner.nextLine();
  }
}
