package testEnum;

import java.util.ArrayList;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/6/2023, Wednesday
 **/
public class test {
  public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();

    Student student1 = new Student(1, "Student 1", 6);
    Student student2 = new Student(2, "Student 2", 9);
    Student student3 = new Student(3, "Student 3", 3);
    Student student4 = new Student(4, "Student 4", 7);
    Student student5 = new Student(5, "Student 5", 1.5);

    list.add(student1);
    list.add(student2);
    list.add(student3);
    list.add(student4);
    list.add(student5);

    for (Student student : list) {
      System.out.println(student);
    }
  }
}
