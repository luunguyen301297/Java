package oop.SingletonPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/23/2023, Monday
 **/
public class DataMgr {
  List<Category> categories;
  List<Product> products;

  private DataMgr() {
    categories = new ArrayList<>();
    products = new ArrayList<>();
    System.out.println("Init Object from DataMgr Class");
  }

  private static DataMgr instance = null;

  //synchronized : multi Thread -> synchronized Thread
  public synchronized static DataMgr getInstance() {
    if (instance == null) {
      instance = new DataMgr();
    }
    return instance;
  }

  public List<Category> getCategories() {
    return categories;
  }

  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public static void setInstance(DataMgr instance) {
    DataMgr.instance = instance;
  }
}
