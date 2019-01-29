package niehua.studyforjava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by niehua.yang on 2019/1/28
 */
public class WeekOfDateTest {

    public static void main(String[] args) {

        String time = "2019-01-26 15:58:42";
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = formatter2.parse(time);
        } catch (ParseException e) {
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (day == 0)
            day = 7;
        System.out.println(day);
        System.out.println(DayOfWeek.of(day));
    }
}
