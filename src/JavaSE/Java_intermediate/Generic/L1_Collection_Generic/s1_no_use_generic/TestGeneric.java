package JavaSE.Java_intermediate.Generic.L1_Collection_Generic.s1_no_use_generic;

import java.util.ArrayList;

import JavaSE.charactor.ADHero;
import JavaSE.charactor.APHero;

/*
不使用泛型带来的问题
ADHero（物理攻击英雄） APHero（魔法攻击英雄）都是Hero的子类
ArrayList 默认接受Object类型的对象，所以所有对象都可以放进ArrayList中
所以get(0) 返回的类型是Object
接着，需要进行强制转换才可以得到APHero类型或者ADHero类型。
如果软件开发人员记忆比较好，能记得哪个是哪个，还是可以的。
但是开发人员会犯错误，比如第30行，会记错，把第0个对象转换为ADHero,这样就会出现类型转换异常
 */

public class TestGeneric {

    public static void main(String[] args) {

        ArrayList heros = new ArrayList();

        heros.add(new APHero());
        heros.add(new ADHero());

        APHero apHero =  (APHero) heros.get(0);
        ADHero adHero =  (ADHero) heros.get(1);

        //类型转换异常
        ADHero adHero2 =  (ADHero) heros.get(0);
    }
}
