package JavaSE.Java_intermediate.Thread.L2_Thread_method.s1_sleep;

/*
JavaSE.Java_intermediate.Thread.sleep(1000); ：表示当前线程暂停1000毫秒 ，其他线程不受影响
JavaSE.Java_intermediate.Thread.sleep(1000); ：会抛出InterruptedException 中断异常，
因为当前线程sleep的时候，有可能被停止，这时就会抛出 InterruptedException
 */

public class TestThread {

    public static void main(String[] args) {

        Thread t1= new Thread(){
            public void run(){
                int seconds =0;
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.printf("已经玩了LOL %d 秒%n", seconds++);
                }
            }
        };
        t1.start();

    }

}