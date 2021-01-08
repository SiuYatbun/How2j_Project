package JavaSE.Java_elementary.Date.L1_Date.s3_getTime;

import java.util.Date;

/*
getTime() 得到一个long型的整数
这个整数代表 从1970.1.1 08:00:00:000 开始 每经历一毫秒，增加1
直接打印对象，会看到 “Tue Jan 05 09:51:48 CST 2016” 这样的格式，可读性比较差，
为了获得“2016/1/5 09:51:48”这样的格式 请参考日期格式化
 */

public class TestDate {

    public static void main(String[] args) {
        //注意：是java.util.JavaSE.Java_elementary.Date;
        //而非 java.sql.JavaSE.Java_elementary.Date，此类是给数据库访问的时候使用的
        Date now= new Date();
        //打印当前时间
        System.out.println("当前时间:"+now.toString());
        //getTime() 得到一个long型的整数
        //这个整数代表 1970.1.1 08:00:00:000，每经历一毫秒，增加1
        System.out.println("当前时间getTime()返回的值是："+now.getTime());

        Date zero = new Date(0);
        System.out.println("用0作为构造方法，得到的日期是:"+zero);

    }
}