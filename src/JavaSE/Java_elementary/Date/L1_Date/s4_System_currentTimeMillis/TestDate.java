package JavaSE.Java_elementary.Date.L1_Date.s4_System_currentTimeMillis;

import java.util.Date;

/*
当前日期的毫秒数
new JavaSE.Java_elementary.Date().getTime() 和 System.currentTimeMillis() 是一样的
不过由于机器性能的原因，可能会相差几十毫秒，毕竟每执行一行代码，都是需要时间的
 */

public class TestDate {

    public static void main(String[] args) {
        Date now= new Date();

        //当前日期的毫秒数
        System.out.println("JavaSE.Java_elementary.Date.getTime() \n返回值: "+now.getTime());
        //通过System.currentTimeMillis()获取当前日期的毫秒数
        System.out.println("System.currentTimeMillis() \n返回值: "+System.currentTimeMillis());

    }
}