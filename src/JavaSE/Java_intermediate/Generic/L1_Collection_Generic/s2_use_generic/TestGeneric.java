package JavaSE.Java_intermediate.Generic.L1_Collection_Generic.s2_use_generic;

import java.util.ArrayList;

import JavaSE.charactor.APHero;

/*
使用泛型的好处：
泛型的用法是在容器后面添加<Type>
Type可以是类，抽象类，接口
泛型表示这种容器，只能存放APHero，ADHero就放不进去了。
 */

public class TestGeneric {

    public static void main(String[] args) {
        ArrayList<APHero> heros = new ArrayList<APHero>();

        //只有APHero可以放进去
        heros.add(new APHero());

        //ADHero甚至放不进去
        //heros.add(new ADHero());

        //获取的时候也不需要进行转型，因为取出来一定是APHero
        APHero apHero =  heros.get(0);

    }
}