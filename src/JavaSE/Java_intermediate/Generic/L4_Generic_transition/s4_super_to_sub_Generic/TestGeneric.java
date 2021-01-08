package JavaSE.Java_intermediate.Generic.L4_Generic_transition.s4_super_to_sub_Generic;

import java.util.ArrayList;

import JavaSE.charactor.ADHero;
import JavaSE.charactor.Hero;

/*
上面使用反证法分析了，子类泛型不能转换为父类泛型。

那么父类泛型又能否转换成子类泛型？ 为什么？

不能成功，因为原来父类泛型集合存放了一些父类对象及其子类对象。
当某个子类泛型引用指向它之后，就表示这个集合只能存该子类及其子类，但事实上不是这样的。
当用子类对象取出某个元素的时候，就可能会出现转型错误（即父类无法转为子类）
 */



public class TestGeneric {

    public static void main(String[] args) {
        ArrayList<Hero> hs =new ArrayList<>();
        ArrayList<ADHero> adhs =new ArrayList<>();

        //父类泛型转子类泛型，能否成功？为什么？
//        adhs = hs;

    }

}
