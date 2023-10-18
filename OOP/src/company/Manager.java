package company;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/4/2023, Monday
 **/
public class Manager extends Staff{
  public Manager(String name, String address, int idCard) {
    super(name, address, idCard);
  }

  @Override
  public double getSalary(int workDays) {
    return basicSalary * workDays * 5;
  }
}
