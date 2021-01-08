package JavaSE.Java_intermediate.Generic.L4_Generic_transition.s2_sub_to_super_Generic;

import java.util.ArrayList;

import JavaSE.charactor.ADHero;
import JavaSE.charactor.Hero;

/*
既然 子类对象 转 父类对象是可以成功的，那么子类泛型转父类泛型能成功吗？
如代码
hs的泛型是父类Hero
adhs 的泛型是子类ADHero

那么 把adhs转换为hs能成功吗？
 */
public class TestGeneric {

    public static void main(String[] args) {
        ArrayList<Hero> hs =new ArrayList<>();
        ArrayList<ADHero> adhs =new ArrayList<>();

        //子类泛型转父类泛型
//        hs = adhs;
    }

}
