package niehua.studyforjava.date;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by niehua.yang on 2019/1/28
 */
public class CalendarTest {

    public static void main(String[] args) {
        Date now = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(now);

        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        int month = cal.get(Calendar.MONTH) +1;
        System.out.println(month);

        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
    }
}
