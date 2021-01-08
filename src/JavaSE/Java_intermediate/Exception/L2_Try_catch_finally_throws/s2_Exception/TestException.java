package JavaSE.Java_intermediate.Exception.L2_Try_catch_finally_throws.s2_Exception;

import java.io.File;
import java.io.FileInputStream;

/*
FileNotFoundException是Exception的子类，使用Exception也可以catch住FileNotFoundException
 */

public class TestException {

    public static void main(String[] args) {

        File f= new File("d:/LOL.exe");

        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }

        catch(Exception e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }

    }
}