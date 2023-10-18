package zoo;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/7/2023, Thursday
 **/
public class Animals {
  private String name;
  private String foodType;

  public Animals(String name, String foodType) {
    this.name = name;
    this.foodType = foodType;
  }

  public Animals() {
  }

  public String getName() {
    return name;
  }

  public String getFoodType() {
    return foodType;
  }

  public void running() {
    System.out.println(name + " is running >>>");
  }

  public void showSound() {
    System.out.println(name + " dang keu...");
  }
}
