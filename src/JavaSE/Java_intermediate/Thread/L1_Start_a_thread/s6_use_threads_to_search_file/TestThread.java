package JavaSE.Java_intermediate.Thread.L1_Start_a_thread.s6_use_threads_to_search_file;

import java.io.File;

/*
把 练习-查找文件内容 改为多线程查找文件内容
原练习的思路是遍历所有文件，当遍历到文件是 .java的时候，查找这个文件的内容，查找完毕之后，再遍历下一个文件

现在通过多线程调整这个思路：
遍历所有文件，当遍历到文件是.java的时候，创建一个线程去查找这个文件的内容，
不必等待这个线程结束，继续遍历下一个文件
 */

/*
首先准备一个SerachFileThread,继承Thread类，并重写run方法。 在run方法中，读取文件内容并查找

然后在遍历文件的时候，如果是以.java结尾，则启动一个SerachFileThread线程，进行查找工作
 */

public class TestThread {

    public static void search(File file, String search) {


                if (file.isFile()) {
                    if (file.getName().toLowerCase().endsWith(".java")) {
                        //当找到.java文件的时候，就启动一个线程，进行专门的查找
                        new SearchFileThread(file, search).start();
                    }
                }
                if (file.isDirectory()) {
                    File[] fs = file.listFiles();
                    for (File f : fs) {
                        search(f, search);
                    }
                }

    }

    public static void main(String[] args) {
        File folder =new File("E:\\How2j_Project");
        search(folder,"void");
    }
}
