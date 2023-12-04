package algorithms;

import java.util.Scanner;

public class SearchString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter string: ");
    String originalStr = scanner.nextLine();

    System.out.println("Enter searching string: ");
    String searchStr = scanner.nextLine();

//    int count = 0;
//    ArrayList<Integer> indexList = new ArrayList<>();
//
//    if (!originalStr.contains(searchStr))
//      System.out.println("sourceStr not contains searchStr");
//    else {
//      for (int i = 0; i < originalStr.length(); i++) {
//        int index = originalStr.indexOf(searchStr, i);
//        if (index >= 0 && !indexList.contains(index)) {
//          count++;
//          indexList.add(index);
//          System.out.println("Index : " + index);
//        }
//      }
//      System.out.println("Count : " + count);
//    }

    int count = 0;

    if (!originalStr.contains(searchStr))
      System.out.println("Can't find " + searchStr);
    else {
      for (int i = 0; i < originalStr.length();) {
        int index = originalStr.indexOf(searchStr, i);
        if (index >= 0) {
          i = index + 1;
          System.out.println("Index : " + index);
          count++;
        }
      }
    }
    System.out.println("Count : " + count);
  }
}
