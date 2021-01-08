package JavaSE.Java_intermediate.Lambda.L2_Method_reference.s2_reference_object_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import JavaSE.Java_intermediate.Lambda.L1_Hello_Lambda.s2_anonymous_Class.HeroChecker;
import JavaSE.charactor.Hero;

/*
与引用静态方法很类似，只是传递方法的时候，需要一个对象的存在

TestLambda testLambda = new TestLambda();
filter(heros, testLambda::testHero);


这种方式叫做引用对象方法
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

        System.out.println("使用引用对象方法  的过滤结果：");
        //使用类的对象方法
        TestLambda testLambda = new TestLambda();
        filter(heros, testLambda::testHero);
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
