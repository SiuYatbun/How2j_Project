package JavaSE.Java_intermediate.Thread.L6_alternate.s6_threads_alternate;

import java.util.ArrayList;
import java.util.List;

public class TestThread {
    public static void main(String[] args) {
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;

        List<Thread> T1 = new ArrayList<Thread>();   //hurt
        List<Thread> T2 = new ArrayList<Thread>();   //recover

        for (int i = 0; i < 2; i++)
        {
            Thread t1 = new Thread(){
                public void run(){
                    while(true){
                        gareen.recover();

                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }

                }
            };
            T1.add(t1);
        }

        for (int i = 0; i < 5; i++)
        {
            Thread t2 = new Thread(){
                public void run(){
                    while(true){
                        gareen.hurt();

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }

                }
            };
            T2.add(t2);
        }

        for (Thread thread : T1)
        {
            try
            {
                thread.join();
                thread.start();
            } catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        for (Thread thread : T2)
        {
            try
            {
                thread.join();
                thread.start();
            } catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
