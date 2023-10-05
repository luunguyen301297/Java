package QLBB;

import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/22/2023, Friday
 **/
public class DailyTicket extends Ticket{
  String durationCode;

  public DailyTicket() {
  }

  public String getDurationCode() {
    return durationCode;
  }

  public void setDurationCode(String durationCode) {
    this.durationCode = durationCode;
  }

  @Override
  public void input() {
    super.input();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter duration code : ");
    durationCode = scanner.nextLine();
  }
}
