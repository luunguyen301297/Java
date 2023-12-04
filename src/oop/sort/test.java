package oop.sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/6/2023, Wednesday
 **/
public class test {
  public static void main(String[] args) {
    ArrayList<Product> list = new ArrayList<>();
    Product product1 = new Product("Toukuda", 500);
    Product product2 = new Product("Biden", 400);
    Product product3 = new Product("TapCanBinh", 200);
    Product product4 = new Product("Charles", 300);

    list.add(product1);
    list.add(product2);
    list.add(product3);
    list.add(product4);

    for (Product product : list) {
      System.out.println(product);
    }

    Collections.sort(list);
    System.out.println("--------------");

    for (Product product : list) {
      System.out.println(product);
    }
  }
}
