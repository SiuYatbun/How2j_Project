package JavaSE.Java_intermediate.Generic.L4_Generic_transition.s3_if_can_transit;

import java.util.ArrayList;

import JavaSE.charactor.ADHero;
import JavaSE.charactor.APHero;
import JavaSE.charactor.Hero;

/*
假设可以转型成功
引用hs指向了ADHero泛型的容器
作为Hero泛型的引用hs, 看上去是可以往里面加一个APHero的。
但是hs这个引用，实际上是指向的一个ADHero泛型的容器
如果能加进去，就变成了ADHero泛型的容器里放进了APHero，这就矛盾了

所以子类泛型不可以转换为父类泛型
 */

public class TestGeneric {

    public static void main(String[] args) {
        ArrayList<Hero> hs =new ArrayList<>();
        ArrayList<ADHero> adhs =new ArrayList<>();

        //假设能转换成功
//        hs = adhs;

        //作为Hero泛型的hs,是可以向其中加入APHero的
        //但是hs这个引用，实际上是指向的一个ADHero泛型的容器
        //如果能加进去，就变成了ADHero泛型的容器里放进了APHero，这就矛盾了
        hs.add(new APHero());
    }

}