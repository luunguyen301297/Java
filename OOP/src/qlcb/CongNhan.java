package qlcb;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/8/2023, Friday
 **/
public class CongNhan extends CanBo{
  public static final int RANK_MAX = 7;
  int rank;

  public CongNhan() {
  }

  public CongNhan(String name, String birthday, String gender, String address, int rank) {
    super(name, birthday, gender, address);
    this.rank = rank;
  }

  public int getRank() {
    return rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  @Override
  public String toString() {
    return super.toString() + " | Rank: " + rank;
  }

  @Override
  public void input() {
    super.input();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap cap bac nhan vien:");
    rank = Integer.parseInt(scanner.nextLine());
  }
}
