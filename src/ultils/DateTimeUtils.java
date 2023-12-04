package ultils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/19/2023, Thursday
 **/
public class DateTimeUtils {
  public static Integer getAge(LocalDate date) {
    int age = 0;
    LocalDate dayNow = LocalDate.now();
    if (dayNow.getMonthValue() > date.getMonthValue()) {
      age = dayNow.getYear() - date.getYear();
    } else if (dayNow.getMonthValue() < date.getMonthValue()) {
      age = dayNow.getYear() - date.getYear() - 1;
    } else {
      if (dayNow.getDayOfMonth() >= date.getDayOfMonth()) {
        age = dayNow.getYear() - date.getYear();
      } else {
        age = dayNow.getYear() - date.getYear() - 1;
      }
    }
    return age;
  }

  public static String convertDateToString(LocalDate date) {
    LocalDate localDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return localDate.format(formatter);
  }
}
