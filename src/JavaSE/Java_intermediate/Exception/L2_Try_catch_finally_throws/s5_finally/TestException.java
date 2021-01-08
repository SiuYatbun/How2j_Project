package JavaSE.Java_intermediate.Exception.L2_Try_catch_finally_throws.s5_finally;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
无论是否出现异常，finally中的代码都会被执行
 */

public class TestException {

    public static void main(String[] args) {

        File f= new File("d:/LOL.exe");

        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }
        catch(FileNotFoundException e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }
        finally{
            System.out.println("无论文件是否存在， 都会执行的代码");
        }
    }
}