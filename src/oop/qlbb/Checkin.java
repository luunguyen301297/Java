package oop.qlbb;

import java.util.Date;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/22/2023, Friday
 **/
public class Checkin {
  String ticketCode;
  String durationCode;
  Date checkinTime;

  public Checkin() {
  }

  public String getTicketCode() {
    return ticketCode;
  }

  public void setTicketCode(String ticketCode) {
    this.ticketCode = ticketCode;
  }

  public String getDurationCode() {
    return durationCode;
  }

  public void setDurationCode(String durationCode) {
    this.durationCode = durationCode;
  }

  public Date getCheckinTime() {
    return checkinTime;
  }

  public void setCheckinTime(Date checkinTime) {
    this.checkinTime = checkinTime;
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Choose ticket type : ");
    System.out.println("1. Monthly ticket");
    System.out.println("2. Daily ticket");

    int choose = Integer.parseInt(scanner.nextLine());

    switch (choose) {
      case 1:
        System.out.println("Enter ticket code : ");
        ticketCode = scanner.nextLine();
        break;
      default:
        DailyTicket dailyTicket = new DailyTicket();
        dailyTicket.input();
        ticketCode = dailyTicket.getCode();
        break;
    }

    System.out.println("Enter duration code : ");
    durationCode = scanner.nextLine();

    checkinTime = new Date();
  }
}
