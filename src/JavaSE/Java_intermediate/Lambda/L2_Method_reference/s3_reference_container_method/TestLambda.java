package JavaSE.Java_intermediate.Lambda.L2_Method_reference.s3_reference_container_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import JavaSE.Java_intermediate.Lambda.L1_Hello_Lambda.s2_anonymous_Class.HeroChecker;
import JavaSE.charactor.Hero;

/*
首先为Hero添加一个方法

public boolean matched(){
   return this.hp>100 && this.damage<50;
}


使用Lambda表达式
filter(heros,h-> h.hp>100 && h.damage<50 );


在Lambda表达式中调用容器中的对象Hero的方法matched
filter(heros,h-> h.matched() );


matched恰好就是容器中的对象Hero的方法，那就可以进一步改写为
filter(heros, Hero::matched);


这种方式就叫做引用容器中的对象的方法
 */
public class TestLambda {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i,
                    r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);

        System.out.println("Lambda表达式：");
        filter(heros,h-> h.hp>100 && h.damage<50 );

        System.out.println("Lambda表达式中调用容器中的对象的matched方法：");
        filter(heros,h-> h.matched() );

        System.out.println("引用容器中对象的方法 之过滤结果：");
        filter(heros, Hero::matched);
    }


    public boolean testHero(Hero h) {
        return h.hp>100 && h.damage<50;
    }

    private static void filter(List<Hero> heros, HeroChecker checker) {
        for (Hero hero : heros) {
            if (checker.test(hero))
                System.out.print(hero);
        }
    }

}
