package java1.date_time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/19/2023, Thursday
 **/
public class DateTime {
  public static void main(String[] args) throws InterruptedException {
    Date date1 = new Date();
//    Thread.sleep(TimeUnit.SECONDS.toMillis(3));
    Date date2 = new Date(System.currentTimeMillis());

    int compare = date1.compareTo(date2);
    System.out.println(compare);

    date1.before(date2); //return boolean

    System.out.println(convertDateToString(date1));

    testCalendar();
  }

  public static String convertDateToString(Date date) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    return dateFormat.format(calendar.getTime());
  }

  public static void testCalendar() {
    Calendar calendar = Calendar.getInstance();
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH + 1);
    int day = calendar.get(Calendar.DAY_OF_MONTH);
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    int millisecond = calendar.get(Calendar.MILLISECOND);

    System.out.println(year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second + ":" + millisecond);
  }
}
