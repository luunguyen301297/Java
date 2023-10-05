package Java2;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/28/2023, Thursday
 **/
public class collections {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("a0");
    list.add("a1");
    list.add("a2");

    list.remove(1);
    list.add(1, "a1");
    list.set(2, "abc");

    //swap id1 <-> id2
    String temp = list.get(1);
    list.set(1, list.get(2));
    list.set(2, temp);

//    C1:
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }


//    C2:
//    for (String item : list) {
//      System.out.println(item);
//    }


//    C3:
//    list.forEach((item) -> {
//      System.out.println(item);
//    });

//    C4:
//    Iterator<String> iterator = list.iterator();
//    while (iterator.hasNext()) {
//      String item = iterator.next();
//      System.out.println(item);
//    }


//    C5:
//    list.stream().forEach(System.out::println);


//    C6:
//    list.parallelStream().forEach(System.out::println);


    //Vector :
    //cap phat san 10 o nho -> xu ly nhanh
    //full 10 o nho thi cap phat tiep 10 o nho -> ton tai nguyen
    Vector<String> list1 = new Vector<>();

    //LinkerList :
    //luu tru ca gia tri cua phan tu va con tro cua no
    //luu tru k lien tiep nhau -> xu ly cham
    LinkedList<String> list2 = new LinkedList<>();

    System.out.println("----------------------");

    //Map :
    //HashMap
    HashMap<String,String> map = new HashMap<>();
    map.put("name", "Gay");
    map.put("age", "18");
    map.put("address", "USA");

    System.out.println(map.get("name"));

    System.out.println("----------------------");

    //Stack (Deque) : last in, fist out
    //Queue : first in, first out
    PriorityQueue<String> queue = new PriorityQueue<>();
    queue.offer("a1");
    queue.offer("a2");
    queue.offer("a3");

    System.out.println(queue.poll());
    System.out.println();
    for (String part : queue) {
      System.out.println(part);
    }
  }
}
