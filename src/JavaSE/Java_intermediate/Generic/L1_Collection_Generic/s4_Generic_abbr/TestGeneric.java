package JavaSE.Java_intermediate.Generic.L1_Collection_Generic.s4_Generic_abbr;

import java.util.ArrayList;

import JavaSE.charactor.Hero;

/*
为了不使编译器出现警告，需要前后都使用泛型，像这样：
ArrayList<Hero> heros = new ArrayList<Hero>();

不过JDK7提供了一个可以略微减少代码量的泛型简写方式
ArrayList<Hero> heros2 = new ArrayList<>();

后面的泛型可以用<>来代替，聊胜于无吧
 */

public class TestGeneric {

    public static void main(String[] args) {
        ArrayList<Hero> heros = new ArrayList<Hero>();
        //后面可以只用<>
        ArrayList<Hero> heros2 = new ArrayList<>();

    }
}