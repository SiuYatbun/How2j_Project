package JavaSE.Java_intermediate.Exception.L3_Kinds_of_Exception.s1_CheckedException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
可查异常： CheckedException
可查异常即必须进行处理的异常，要么try catch住,要么往外抛，谁调用，谁处理，比如 FileNotFoundException
如果不处理，编译器，就不让你通过
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

    }
}