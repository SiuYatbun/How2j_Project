package JavaSE.Java_intermediate.Collection.ArrayList.L5_Traversal.s1_for;

import java.util.ArrayList;
import java.util.List;

import JavaSE.charactor.Hero;

/*
通过前面的学习，知道了可以用size()和get()分别得到大小，和获取指定位置的元素，结合for循环就可以遍历出ArrayList的内容
 */

public class TestCollection {

    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<Hero>();

        // 放5个Hero进入容器
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero name " + i));
        }

        // 第一种遍历 for循环
        System.out.println("--------for 循环-------");
        for (int i = 0; i < heros.size(); i++) {
            Hero h = heros.get(i);
            System.out.println(h);
        }

    }

}