package oop.SingletonPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/25/2023, Wednesday
 **/
public class DataManager {
  List<Category> categories;
  List<Product> products;

  private DataManager() {
    categories = new ArrayList<>();
    products = new ArrayList<>();
  }

  private static DataManager instance = null;

  public static DataManager getInstance() {
    if (instance == null) {
      instance = new DataManager();
    }
    return instance;
  }
}
