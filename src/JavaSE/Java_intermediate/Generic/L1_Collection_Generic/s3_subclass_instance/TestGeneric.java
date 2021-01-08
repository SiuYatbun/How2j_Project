package JavaSE.Java_intermediate.Generic.L1_Collection_Generic.s3_subclass_instance;

import java.util.ArrayList;

import JavaSE.charactor.ADHero;
import JavaSE.charactor.APHero;
import JavaSE.charactor.Hero;

/*
假设容器的泛型是Hero,那么Hero的子类APHero,ADHero都可以放进去
和Hero无关的类型Item还是放不进去
 */

public class TestGeneric {

    public static void main(String[] args) {
        ArrayList<Hero> heros = new ArrayList<Hero>();

        //只有作为Hero的子类可以放进去
        heros.add(new APHero());
        heros.add(new ADHero());

        //和Hero无关的类型Item还是放不进去
        //heros.add(new Item());

    }
}
