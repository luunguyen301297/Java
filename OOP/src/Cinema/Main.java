package Cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/1/2023, Sunday
 **/
public class Main {
  public static void main(String[] args) {
    List<IStatus> statusList = new ArrayList<>();
    System.out.println("Nhap 2 quay ban ve:");
    for (int i = 0; i < 3; i++) {
      TicketCounter ticketCounter = new TicketCounter();
      ticketCounter.input();

      statusList.add(ticketCounter);
    }

    System.out.println("Nhap 2 quay ban do an:");
    for (int i = 0; i < 2; i++) {
      Food food = new Food();
      food.input();

      statusList.add(food);
    }

    for (int i = 0; i < 2; i++) {
      System.out.println("Nhap 2 bai do xe:");
      Parking parking = new Parking();
      parking.input();

      statusList.add(parking);
    }

    System.out.println("Nhap 5 phong chieu phim:");
    for (int i = 0; i < 5; i++) {
      Room room = new Room();
      room.input();

      statusList.add(room);
    }

    System.out.println("Hien thi thong tin trang thai:");
    followStatus(statusList);
  }

  static void followStatus(List<IStatus> statusList) {
    for (IStatus iStatus : statusList) {
      iStatus.onStatus();
    }
  }
}
