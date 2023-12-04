package oop.qlhh;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/14/2023, Thursday
 **/
public class QLHH {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    System.out.println("Enter number of arr : ");
    n = Integer.parseInt(scanner.nextLine());

    Product[] productList = new Product[n];

    for (int i = 0; i < n; i++) {
      productList[i] = new Product();
      productList[i].input();
    }

    int idMax = 0;
    for (int i = 1; i < n; i++) {
      if (productList[i].getPrice() > productList[idMax].getPrice()) {
        idMax = i;
      }
    }
    productList[idMax].display();
  }
}
