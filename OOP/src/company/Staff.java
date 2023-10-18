package company;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/4/2023, Monday
 **/
public abstract class Staff {
  protected String name;
  protected String address;
  protected int idCard;
  protected double basicSalary = 100;

  public Staff(String name, String address, int idCard) {
    this.name = name;
    this.address = address;
    this.idCard = idCard;
  }

  public void showInfo() {
    System.out.println("Name : " + name + " | Address : " + address + " | ID : " + idCard);
  }

  public abstract double getSalary(int workDays);
}
