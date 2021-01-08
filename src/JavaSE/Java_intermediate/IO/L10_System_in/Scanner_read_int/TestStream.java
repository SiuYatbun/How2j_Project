package JavaSE.Java_intermediate.IO.L10_System_in.Scanner_read_int;

import java.util.Scanner;

/*
使用Scanner从控制台读取整数
 */

public class TestStream {
    public static void main(String[] args) {
        System.out.println("请输入两个整数:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数："+a);
        int b = s.nextInt();
        System.out.println("第二个整数："+b);
    }
}