package company;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/4/2023, Monday
 **/
public class test {
  public static void main(String[] args) {
    Manager manager = new Manager("Luu", "Nghe An", 333);
    OfficalStaff staff = new OfficalStaff("Biden", "White House", 123);
    PartTimeStaff staffC1 = new PartTimeStaff("Putin", "Kremlin", 456, 1);
    PartTimeStaff staffC2 = new PartTimeStaff("Charles", "Buckingham", 789, 2);

    System.out.print("Manager: ");
    manager.showInfo();
    System.out.print("Staff: ");
    staff.showInfo();
    System.out.print("Staff C1: ");
    staffC1.showInfo();
    System.out.print("Staff C2: ");
    staffC2.showInfo();
    System.out.println("-----------------------------");

    System.out.println("Manager salary : " + manager.getSalary(30));
    System.out.println("Staff salary : " + staff.getSalary(30));
    System.out.println("Staff C1 salary : " + staffC1.getSalary(28));
    System.out.println("Staff C2 salary : " + staffC2.getSalary(28));
  }
}
