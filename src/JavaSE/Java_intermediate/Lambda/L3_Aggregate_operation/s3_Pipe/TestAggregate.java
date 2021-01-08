package JavaSE.Java_intermediate.Lambda.L3_Aggregate_operation.s3_Pipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import JavaSE.charactor.Hero;

/*
把Collection切换成管道源很简单，调用stream()就行了。
heros.stream()


但是数组却没有stream()方法，需要使用
Arrays.stream(hs)


或者
Stream.of(hs)
 */

public class TestAggregate {

    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i,
                    r.nextInt(1000), r.nextInt(100)));
        }
        //管道源是集合
        heros
                .stream()
                .forEach(h->System.out.println(h.name));

        System.out.println("-------");

        //管道源是数组
        Hero hs[] = heros.toArray(new Hero[heros.size()]);
        Arrays.stream(hs)
                .forEach(h->System.out.println(h.name));

    }
}