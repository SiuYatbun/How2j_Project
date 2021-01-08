package JavaSE.Java_intermediate.Generic.L4_Generic_transition.s1_sub_to_super;

import JavaSE.charactor.ADHero;
import JavaSE.charactor.Hero;

/*
根据面向对象学习的知识，子类转父类 是一定可以成功的
 */

public class TestGeneric {

    public static void main(String[] args) {

        Hero h = new Hero();
        ADHero ad = new ADHero();
        //子类转父类
        h = ad;
    }

}
