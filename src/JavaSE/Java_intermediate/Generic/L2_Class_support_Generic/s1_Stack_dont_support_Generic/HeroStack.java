package JavaSE.Java_intermediate.Generic.L2_Class_support_Generic.s1_Stack_dont_support_Generic;

import java.util.LinkedList;

import JavaSE.charactor.Hero;

/*
以Stack栈为例子，如果不使用泛型
当需要一个只能放Hero的栈的时候，就需要设计一个HeroStack
当需要一个只能放Item的栈的时候，就需要一个ItemStack
 */

public class HeroStack {

    LinkedList<Hero> heros = new LinkedList<Hero>();

    public void push(Hero h) {
        heros.addLast(h);
    }

    public Hero pull() {
        return heros.removeLast();
    }

    public Hero peek() {
        return heros.getLast();
    }

    public static void main(String[] args) {

        HeroStack heroStack = new HeroStack();

        for (int i = 0; i < 5; i++) {
            Hero h = new Hero("hero name " + i);
            System.out.println("压入 hero:" + h);
            heroStack.push(h);
        }

        for (int i = 0; i < 5; i++) {
            Hero h =heroStack.pull();
            System.out.println("弹出 hero" + h);
        }

    }

}
