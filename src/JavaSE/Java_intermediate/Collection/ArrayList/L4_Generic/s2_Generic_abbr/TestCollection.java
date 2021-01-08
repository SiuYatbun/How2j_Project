package JavaSE.Java_intermediate.Collection.ArrayList.L4_Generic.s2_Generic_abbr;

import java.util.ArrayList;
import java.util.List;

import JavaSE.charactor.Hero;

/*
为了不使编译器出现警告，需要前后都使用泛型，像这样：
List<Hero> genericheros = new ArrayList<Hero>();

不过JDK7提供了一个可以略微减少代码量的泛型简写方式
List<Hero> genericheros2 = new ArrayList<>();

后面的泛型可以用<>来代替，聊胜于无吧
 */

public class TestCollection {

    public static void main(String[] args) {
        List<Hero> genericheros = new ArrayList<Hero>();
        List<Hero> genericheros2 = new ArrayList<>();

    }

}
