package JavaSE.Java_intermediate.Exception.L1_What_is_Exception;

import java.io.File;

/*
比如要打开d盘的LOL.exe文件，这个文件是有可能不存在的
Java中通过 new FileInputStream(f) 试图打开某文件，就有可能抛出文件不存在异常FileNotFoundException
如果不处理该异常，就会有编译错误
处理办法参见 异常处理
 */

public class TestException {

    public static void main(String[] args) {

        File f= new File("d:/LOL.exe");

        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
//        new FileInputStream(f);

    }
}
