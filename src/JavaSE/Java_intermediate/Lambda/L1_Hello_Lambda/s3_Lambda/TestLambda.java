package JavaSE.Java_intermediate.Lambda.L1_Hello_Lambda.s3_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import JavaSE.Java_intermediate.Lambda.L1_Hello_Lambda.s2_anonymous_Class.HeroChecker;
import JavaSE.charactor.Hero;

/*
使用Lambda方式筛选出数据
filter(heros,(h)->h.hp>100 && h.damage<50);

同样是调用filter方法，从上一步的传递匿名类对象，变成了传递一个Lambda表达式进去
h->h.hp>100 && h.damage<50

咋一看Lambda表达式似乎不好理解，其实很简单，下一步讲解如何从一个匿名类一点点演变成Lambda表达式
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
        System.out.println("使用Lamdba的方式，筛选出 hp>100 && damange<50的英雄");
        filter(heros,h->h.hp>100 && h.damage<50);
    }

    private static void filter(List<Hero> heros, HeroChecker checker) {
        for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }
    }

}