package JavaSE.Java_intermediate.Collection.Other_Collection.L4_HashSet.s1_value_unique;

import java.util.HashSet;

/*
Set中的元素，不能重复
 */

public class TestCollection {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();

        names.add("gareen");
        System.out.println(names);

        //第二次插入同样的数据，是插不进去的，容器中只会保留一个
        names.add("gareen");
        System.out.println(names);
    }
}