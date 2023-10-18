package ss5;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/5/2023, Thursday
 **/
public class Human {
  private String name;
  int age;
  String address;
  String email;
  String tell;
  double weight;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Human() {
  }

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Human(String name, int age, String address, String email, String tell, double weight) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.email = email;
    this.tell = tell;
    this.weight = weight;
  }

  public String chekAge() {
    String checkAge = "";
    // todo : check age : 3-6 (mau giao), 6-11 (c1), 11-15 (c2), 15-18 (c3);
    if (this.age >= 3 && this.age < 6) {
      checkAge = "mau giao";
    } else if (this.age >= 6 && this.age < 11) {
      checkAge = "C1";
    } else if (this.age >= 11 && this.age < 15) {
      checkAge = "C2";
    } else if (this.age >= 15 && this.age < 18) {
      checkAge = "C3";
    } else if (this.age >= 18){
      checkAge = "Di tu";
    } else {
      checkAge = "Kid";
    }
    return checkAge;
  }

  public Students grow() {
    Students s = null;
    if (this.age >= 3){
      s = new Students();
      s.setName(this.name);
      s.setAge(this.age);
    }
    return s;
  }
}
