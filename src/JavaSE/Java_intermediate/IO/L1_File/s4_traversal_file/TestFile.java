package JavaSE.Java_intermediate.IO.L1_File.s4_traversal_file;

import java.io.File;

/*
一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
遍历这个目录下所有的文件(不用遍历子目录)
找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名

注: 最小的文件不能是0长度
 */
public class TestFile {

    public static void main(String[] args) {
        File f = new File("E:/电影");
        File [] files = f.listFiles();

        long minsize=Long.MAX_VALUE,maxsize=Long.MIN_VALUE;
        File minfile = null,maxfile = null;
        for(File file : files){
            if(file.isDirectory())
                continue;

            if(file.length()<minsize){
                minfile = file;
                minsize = file.length();
            }else if(file.length()>maxsize){
                maxfile = file;
                maxsize = file.length();
            }
            maxsize = file.length()>maxsize ? file.length():maxsize;
            System.out.println(file+"\t文件大小为:"+file.length()/1024/1024+"MB");
        }

        System.out.println("\n搜索完毕，该文件夹中最小的文件为:\n"+
                minfile.getName()+"\t文件大小为:"+minsize/1024/1024+"MB"+"\n最大的文件为:\n"+
                maxfile.getName()+"\t文件大小为:"+maxsize/1024/1024+"MB");

    }
}
