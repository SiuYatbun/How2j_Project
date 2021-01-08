package JavaSE.Java_intermediate.Thread.S9_AtomicInteger.s2_AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class TestThread {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicI =new AtomicInteger();
        int i = atomicI.decrementAndGet();
        int j = atomicI.incrementAndGet();
        int k = atomicI.addAndGet(3);

        System.out.println(i+" "+j);
    }

}