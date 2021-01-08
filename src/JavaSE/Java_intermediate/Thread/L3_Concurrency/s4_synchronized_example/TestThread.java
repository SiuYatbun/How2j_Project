package JavaSE.Java_intermediate.Thread.L3_Concurrency.s4_synchronized_example;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
步骤 2 : 分析同步问题产生的原因
1. 假设增加线程先进入，得到的hp是10000
2. 进行增加运算
3. 正在做增加运算的时候，还没有来得及修改hp的值，减少线程来了
4. 减少线程得到的hp的值也是10000
5. 减少线程进行减少运算
6. 增加线程运算结束，得到值10001，并把这个值赋予hp
7. 减少线程也运算结束，得到值9999，并把这个值赋予hp
hp，最后的值就是9999
虽然经历了两个线程各自增减了一次，本来期望还是原值10000，但是却得到了一个9999
这个时候的值9999是一个错误的值，在业务上又叫做脏数据
 */

/*
步骤 3 : 解决思路
总体解决思路是： 在增加线程访问hp期间，其他线程不可以访问hp
1. 增加线程获取到hp的值，并进行运算
2. 在运算期间，减少线程试图来获取hp的值，但是不被允许
3. 增加线程运算结束，并成功修改hp的值为10001
4. 减少线程，在增加线程做完后，才能访问hp的值，即10001
5. 减少线程运算，并得到新的值10000
 */

/*
解决上述问题之前，先理解
synchronized关键字的意义
如下代码：

Object someObject =new Object();
synchronized (someObject){
  //此处的代码只有占有了someObject后才可以执行
}

synchronized表示当前线程，独占 对象 someObject
当前线程独占 了对象someObject，如果有其他线程试图占有对象someObject，就会等待，直到当前线程释放对someObject的占用。
someObject 又叫同步对象，所有的对象，都可以作为同步对象
为了达到同步的效果，必须使用同一个同步对象

释放同步对象的方式： synchronized 块自然结束，或者有异常抛出
 */

public class TestThread {

    public static String now(){
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public static void main(String[] args) {
        final Object someObject = new Object();

        Thread t1 = new Thread(){
            public void run(){
                try {
                    System.out.println( now()+" t1 线程已经运行");
                    System.out.println( now()+this.getName()+ " 试图占有对象：someObject");
                    synchronized (someObject) {

                        System.out.println( now()+this.getName()+ " 占有对象：someObject");
                        Thread.sleep(5000);
                        System.out.println( now()+this.getName()+ " 释放对象：someObject");
                    }
                    System.out.println(now()+" t1 线程结束");
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        t1.setName(" t1");
        t1.start();


        Thread t2 = new Thread(){

            public void run(){
                try {
                    System.out.println( now()+" t2 线程已经运行");
                    System.out.println( now()+this.getName()+ " 试图占有对象：someObject");
                    synchronized (someObject) {
                        System.out.println( now()+this.getName()+ " 占有对象：someObject");
                        Thread.sleep(5000);
                        System.out.println( now()+this.getName()+ " 释放对象：someObject");
                    }
                    System.out.println(now()+" t2 线程结束");
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        t2.setName(" t2");
        t2.start();
    }

}