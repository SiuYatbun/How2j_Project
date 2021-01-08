package JavaSE.Java_intermediate.IO.L10_System_in.s1_System_in;

import java.io.IOException;
import java.io.InputStream;

/*
System.out 是常用的在控制台输出数据的
System.in 可以从控制台输入数据
 */

public class TestStream {

    public static void main(String[] args) {
        // 控制台输入
        try (InputStream is = System.in;) {
            while (true) {
                // 敲入a,然后敲回车可以看到
                // 97 13 10
                // 97是a的ASCII码
                // 13 10分别对应回车换行
                int i = is.read();
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}