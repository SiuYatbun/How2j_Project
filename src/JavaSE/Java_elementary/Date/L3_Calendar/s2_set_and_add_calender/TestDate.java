package JavaSE.Java_elementary.Date.L3_Calendar.s2_set_and_add_calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
add()方法，在原日期上增加年/月/日
set()方法，直接设置年/月/日
 */

public class TestDate {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        System.out.println(now);
        // 当前日期
        System.out.println("当前日期：\t" + format(c.getTime()));

        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" +format(c.getTime()));

        // 去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" +format(c.getTime()));

        // 上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" +format(c.getTime()));


    }

    private static String format(Date time) {
        return sdf.format(time);
    }
}