package JavaSE.Java_intermediate.Collection.ArrayList.L5_Traversal.s3_enhanced_for;

import java.util.ArrayList;
import java.util.List;

import JavaSE.charactor.Hero;

public class TestCollection {

    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<Hero>();

        // 放5个Hero进入容器
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero name " + i));
        }

        // 第三种，增强型for循环
        System.out.println("--------增强型for循环-------");
        for (Hero h : heros) {
            System.out.println(h);
        }

    }

}
