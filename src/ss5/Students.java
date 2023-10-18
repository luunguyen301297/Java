package ss5;

import ultils.RandomUtils;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/12/2023, Thursday
 **/
public class Students {
  int age;
  String name;

  public Students() {

  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Students(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public Students radomStudent() {
    Students s = new Students();
    s.name = RandomUtils.randomAlphaNumberic(10);
    s.age = RandomUtils.randomNumber(0, 150);
    return s;
  }
}
