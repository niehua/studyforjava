package niehua.studyforjava.date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by niehua.yang on 2019/1/28
 */
public class DateTset {

    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);

        //DateTimeFormatter 线程安全
        DateTimeFormatter fomatter1 = DateTimeFormatter.ofPattern("yyyy==MM==dd HH时mm分ss秒");

        //SimpleDateFormat 线程不安全
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        String dateStr1 = "2014==04==12 01时06分09秒";
        LocalDateTime res1 = LocalDateTime.parse(dateStr1, fomatter1);
        System.out.println(res1);


        String res2 = formatter2.format(now);
        System.out.println(res2);
        try {
            Date res3 = formatter2.parse(res2);
            System.out.println(res3);
        } catch (
                Exception e) {
        }
    }
}
