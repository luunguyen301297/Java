package java1.date_time;

import java.time.*;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/19/2023, Thursday
 **/
public class LocalDateEx {
  public static void main(String[] args) {
    LocalDate currentDate = LocalDate.now();
    System.out.println(currentDate);

    LocalDate specifiDate = LocalDate.of(2019, Month.AUGUST, 1);
    System.out.println(specifiDate);

    LocalDate toDayHCM = LocalDate.now(ZoneId.of("Asia/Ho_Chi_Minh"));
    LocalTime nowHCM = LocalTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
    System.out.println("To Day in HCM : " + toDayHCM + " / " + nowHCM);

    LocalDate dateFromBaseDate = LocalDate.ofEpochDay(34324);
    System.out.println(dateFromBaseDate);

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    LocalDate localDate1 = LocalDate.now();
    LocalDate localDate2 = LocalDate.of(1997, 12, 30);
    Period period = Period.between(localDate2, localDate1);
    System.out.println(period.getYears());

//    Duration = Duration.between(localDate2, localDate1);
  }
}
