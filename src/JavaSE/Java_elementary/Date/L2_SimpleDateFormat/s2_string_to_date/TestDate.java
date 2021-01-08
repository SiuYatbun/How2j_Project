package JavaSE.Java_elementary.Date.L2_SimpleDateFormat.s2_string_to_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
模式（yyyy/MM/dd HH:mm:ss）需要和字符串格式保持一致，如果不一样就会抛出解析异常ParseException
关于异常的详细讲解在Java 异常 JavaSE.Java_intermediate.Exception 章节展开
 */

public class TestDate {

    public static void main(String[] args) {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );

        String str = "2016/1/5 12:12:12";

        try {
            Date d = sdf.parse(str);
            System.out.printf("字符串 %s 通过格式  yyyy/MM/dd HH:mm:ss %n转换为日期对象: %s",
                    str,d.toString());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}