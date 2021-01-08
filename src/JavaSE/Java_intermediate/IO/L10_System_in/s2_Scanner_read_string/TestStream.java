package JavaSE.Java_intermediate.IO.L10_System_in.s2_Scanner_read_string;

import java.util.Scanner;

/*
使用System.in.read虽然可以读取数据，但是很不方便
使用Scanner就可以逐行读取了
 */

public class TestStream {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while(true){
            String line = s.nextLine();
            System.out.println(line);
        }

    }
}