package oop.zooWithInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/24/2023, Tuesday
 **/
public class CatManager {
  ArrayList<CatDetail> catList = new ArrayList<>();

  public CatManager() {
  }

  public void inputManager(ColorManager colorManager) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of cat to add :");
    int n = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < n; i++) {
     CatDetail catDetail = new CatDetail();
     catDetail.inputInfo(colorManager);

     catList.add(catDetail);
    }
  }

  public void display() {
    for (int i = 0; i < catList.size(); i++) {
      catList.get(i).showInfo();
    }
  }

  public void sortByColor() {
    Collections.sort(catList, new Comparator<CatDetail>() {
      @Override
      public int compare(CatDetail o1, CatDetail o2) {
        return o1.getColor().compareToIgnoreCase(o2.getColor());
      }
    });
    display();
  }

  public void findByType() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the type you want to search :");
    String type = scanner.nextLine();
    int count = 0;

    for (int i = 0; i < catList.size(); i++) {
      if (catList.get(i).getType().equalsIgnoreCase(type)) {
        count++;
        catList.get(i).showInfo();
      }
    }

    if (count == 0) System.out.println("Can't find " + type + " type");
  }
}
