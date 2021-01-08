package JavaSE.Java_intermediate.IO.L5_String_Stream.s1_String_Stream_read_file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader 是Reader子类，以FileReader 为例进行文件读取
 */

public class TestStream {

    public static void main(String[] args) {
        // 准备文件lol.txt其中的内容是AB
        File f = new File("E:/GayGay.txt");
        // 创建基于文件的Reader
        try (FileReader fr = new FileReader(f)) {
            // 创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) f.length()];
            // 以字符流的形式读取文件所有内容
            fr.read(all);
            for (char b : all) {
                // 打印出来是A B
                System.out.print(b);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}