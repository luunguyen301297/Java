package ultils;

import java.util.Calendar;
import java.util.Date;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/19/2023, Thursday
 **/
public class DateTimeUtils {
  public static int getAge(Date date) {
    Calendar calendar1 = Calendar.getInstance();
    calendar1.setTime(date);
    Calendar calendar2 = Calendar.getInstance();
    calendar1.setTime(new Date());
    if (date.after(new Date())) {
      return -1;
    } else {
      return calendar2.get(Calendar.YEAR) - calendar1.get(Calendar.YEAR) + 1;
    }
  }
}
