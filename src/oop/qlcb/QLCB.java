package oop.qlcb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/8/2023, Friday
 **/
public class QLCB {
  static List<CanBo> list = new ArrayList<>();
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int choose;

    do {
      showMenu();
      choose = Integer.parseInt(scanner.nextLine());

      switch (choose) {
        case 1:
          inputData();
          break;
        case 2:
          searchByName();
          break;
        case 3:
          showData();
          break;
        case 4:
          System.out.println("Thoat ct");
          break;
        default:
          System.out.println("Nhap sai, nhap lai");
          break;
      }
    } while (choose != 4);
  }

  static void  showMenu() {
    System.out.println();
    System.out.println("1. Nhap thong tin moi cho can bo:");
    System.out.println("2. Tim kiem theo ten can bo:");
    System.out.println("3. Hien thi thong tin:");
    System.out.println("4. Thoat");
    System.out.println("Chon:");
  }

  static void inputData() {
    System.out.println("Nhap so luong can bo can them:");
    int n = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < n; i++) {
      CanBo canBo = createCanBo();
      list.add(canBo);
    }
  }

  static CanBo createCanBo() {
    CanBo canBo = null;
    System.out.println();
    System.out.println("1. Nhap thong tin cong nhan:");
    System.out.println("2. Nhap thong tin ky su:");
    System.out.println("3. Nhap thong tin nhan vien phuc vu:");
    System.out.println("Chon:");

    int choose = Integer.parseInt(scanner.nextLine());
    switch (choose) {
      case 1:
        canBo = new CongNhan();
        break;
      case 2:
        canBo = new KySu();
        break;
      default:
        canBo = new PhucVu();
        break;
    }
    canBo.input();
    return canBo;
  }

  static void searchByName() {
    System.out.println("Nhap ten can bo can tim kiem:");
    String name = scanner.nextLine();

    for (CanBo canBo : list) {
      if (canBo.getName().equalsIgnoreCase(name)) {
        canBo.display();
      }
    }
  }


  static void showData() {
    for (CanBo canBo : list) {
      canBo.display();
    }
  }
}
