package JavaSE.Java_intermediate.Generic.L3_WildCard.s3_wildcard_question_mark;

import java.util.ArrayList;

import JavaSE.charactor.APHero;

/*
泛型通配符? 代表任意泛型
既然?代表任意泛型，那么换句话说，这个容器什么泛型都有可能

所以只能以Object的形式取出来
并且不能往里面放对象，因为不知道到底是一个什么泛型的容器
 */

public class TestGeneric {

    public static void main(String[] args) {

        ArrayList<APHero> apHeroList = new ArrayList<APHero>();

        //?泛型通配符，表示任意泛型
        ArrayList<?> generalList = apHeroList;

        //?的缺陷1： 既然?代表任意泛型，那么换句话说，你就不知道这个容器里面是什么类型
        //所以只能以Object的形式取出来
        Object o = generalList.get(0);

        //?的缺陷2： 既然?代表任意泛型，那么既有可能是Hero,也有可能是Item
        //所以，放哪种对象进去，都有风险，结果就什么什么类型的对象，都不能放进去
//        generalList.add(new Item()); //编译错误 因为?代表任意泛型，很有可能不是Item
//        generalList.add(new Hero()); //编译错误 因为?代表任意泛型，很有可能不是Hero
//        generalList.add(new APHero()); //编译错误  因为?代表任意泛型，很有可能不是APHero

    }
}
