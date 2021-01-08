package JavaSE.Java_intermediate.Lambda.L2_Method_reference.s1_reference_static_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import JavaSE.Java_intermediate.Lambda.L1_Hello_Lambda.s2_anonymous_Class.HeroChecker;
import JavaSE.charactor.Hero;

/*
首先为TestLambda添加一个静态方法：

public static boolean testHero(Hero h) {
   return h.hp>100 && h.damage<50;
}


Lambda表达式：
filter(heros, h->h.hp>100 && h.damage<50);


在Lambda表达式中调用这个静态方法：
filter(heros, h -> TestLambda.testHero(h) );


调用静态方法还可以改写为：
filter(heros, TestLambda::testHero);


这种方式就叫做引用静态方法
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

        HeroChecker c = new HeroChecker() {
            public boolean test(Hero h) {
                return h.hp>100 && h.damage<50;
            }
        };

        System.out.println("使用匿名类过滤");
        filter(heros, c);
        System.out.println("使用Lambda表达式");
        filter(heros, h->h.hp>100 && h.damage<50);
        System.out.println("在Lambda表达式中使用静态方法");
        filter(heros, h -> TestLambda.testHero(h) );
        System.out.println("直接引用静态方法");
        filter(heros, TestLambda::testHero);
    }

    public static boolean testHero(Hero h) {
        return h.hp>100 && h.damage<50;
    }

    private static void filter(List<Hero> heros, HeroChecker checker) {
        for (Hero hero : heros) {
            if (checker.test(hero))
                System.out.print(hero);
        }
    }

}
