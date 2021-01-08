package JavaSE.Java_elementary.Date.L3_Calendar.s1_Calendar_and_Date;

import java.util.Calendar;
import java.util.Date;

/*
采用单例模式获取日历对象Calendar.getInstance();
 */

public class TestDate {

    public static void main(String[] args) {
        //采用单例模式获取日历对象Calendar.getInstance();
        Calendar c = Calendar.getInstance();

        //通过日历对象得到日期对象
        Date d = c.getTime();

        Date d2 = new Date(0);
        c.setTime(d2); //把这个日历，调成日期 : 1970.1.1 08:00:00
        System.out.println(d);
        System.out.println(c);
    }
}