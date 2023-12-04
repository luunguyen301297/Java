package oop.SingletonPattern;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/25/2023, Wednesday
 **/
public class Product {
  int id, categoryId;
  String title;
  float price;

  public Product() {
  }

  public Product(int id, int categoryId, String title, float price) {
    this.id = id;
    this.categoryId = categoryId;
    this.title = title;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }
}
