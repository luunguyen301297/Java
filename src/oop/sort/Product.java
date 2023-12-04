package oop.sort;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/6/2023, Wednesday
 **/
public class Product implements Comparable<Product> {
  private String name;
  private double cost;

  public Product(String name, double cost) {
    this.name = name;
    this.cost = cost;
  }

  public String getName() {
    return name;
  }

  public double getCost() {
    return cost;
  }

  @Override
  public String toString() {
    return "Name : " + name + " | " +
      "Cost : " + cost;
  }

  @Override
  public int compareTo(Product o) {
    if (this.cost < o.cost)
      return -1;
    else if (this.cost > o.cost) {
      return 1;
    }
    else
      return 0;
  }
}
