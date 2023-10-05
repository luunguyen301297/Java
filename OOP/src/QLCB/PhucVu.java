package QLCB;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/8/2023, Friday
 **/
public class PhucVu extends CanBo{
  protected String work;

  public PhucVu() {
  }

  public PhucVu(String name, String birthday, String gender, String address, String work) {
    super(name, birthday, gender, address);
    this.work = work;
  }

  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  @Override
  public String toString() {
    return super.toString() + " | Work: " + work;
  }

  @Override
  public void input() {
    super.input();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap cong viec:");
    work = scanner.nextLine();
  }
}
