package oop.SingletonPattern;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/25/2023, Wednesday
 **/
public class Category {
  int id;
  String categoryName;

  public Category() {
  }

  public Category(int id, String categoryName) {
    this.id = id;
    this.categoryName = categoryName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }
}
