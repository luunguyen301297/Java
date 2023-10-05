package QLBB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/22/2023, Friday
 **/
public class SwimmingPool {
  List<MonthTicket> monthTickets = new ArrayList<>();
  List<DailyTicket> dailyTickets = new ArrayList<>();
  List<DurationTime> durationTimes = new ArrayList<>();
  List<Checkin> checkins = new ArrayList<>();
  String code;
  String address;

  public SwimmingPool() {
  }

  public List<MonthTicket> getMonthTickets() {
    return monthTickets;
  }

  public void setMonthTickets(List<MonthTicket> monthTickets) {
    this.monthTickets = monthTickets;
  }

  public List<DailyTicket> getDailyTickets() {
    return dailyTickets;
  }

  public void setDailyTickets(List<DailyTicket> dailyTickets) {
    this.dailyTickets = dailyTickets;
  }

  public List<DurationTime> getDurationTimes() {
    return durationTimes;
  }

  public void setDurationTimes(List<DurationTime> durationTimes) {
    this.durationTimes = durationTimes;
  }

  public List<Checkin> getCheckins() {
    return checkins;
  }

  public void setCheckins(List<Checkin> checkins) {
    this.checkins = checkins;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter code : ");
    code = scanner.nextLine();

    System.out.println("Enter address : ");
    address = scanner.nextLine();
  }
}
