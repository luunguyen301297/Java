package java1.map;

import java1.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 11/20/2023, Monday
 **/
public class MapCollection {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("name", "Biden");
    map.put("age", "12");
    map.put("address", "hanoi");
    System.out.println("name : " + map.get("name"));

    Map<String, Student> studentMap = new HashMap<>();
    Student s1 = new Student("S1", "a");
    Student s2 = new Student("S2", "b");
    studentMap.put(s1.getId(), s1);
    studentMap.put(s2.getId(), s2);
    System.out.println(studentMap.get("S1").toString());
    System.out.println(studentMap.get("S2").toString());

    Set<String> keys = studentMap.keySet();
    int i = 0;
    for (String k : keys) {
      System.out.println("Key " + (i++) + " : " + k);
    }

    System.err.println(studentMap.containsKey("S3") ? studentMap.get("S3") : "Can't find Key S3");
  }
}
