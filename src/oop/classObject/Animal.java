package oop.classObject;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/22/2023, Sunday
 **/
public abstract class Animal implements IAction {
  String name, footType;

  public Animal() {
  }

  public Animal(String name, String footType) {
    this.name = name;
    this.footType = footType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFootType() {
    return footType;
  }

  public void setFootType(String footType) {
    this.footType = footType;
  }

  @Override
  public void onRunning(String name) {
    System.out.println(name + " is running");
  }

  public abstract void showShow();
}
