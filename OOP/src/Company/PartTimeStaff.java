package Company;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/4/2023, Monday
 **/
public class PartTimeStaff extends Staff{
  protected int shift;

  public PartTimeStaff(String name, String address, int idCard, int shift) {
    super(name, address, idCard);
    this.shift = shift;
  }

  @Override
  public double getSalary(int workDays) {
    if (shift == 1) {
      return basicSalary * workDays;
    } else {
      return basicSalary * workDays * 1.2;
    }
  }
}
