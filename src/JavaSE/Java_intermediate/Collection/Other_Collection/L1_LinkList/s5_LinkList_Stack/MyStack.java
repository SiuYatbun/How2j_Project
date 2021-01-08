package JavaSE.Java_intermediate.Collection.Other_Collection.L1_LinkList.s5_LinkList_Stack;

import JavaSE.charactor.Hero;
import java.util.LinkedList;

/*
与FIFO(先入先出的)队列类似的一种数据结构是FILO先入后出栈Stack
根据接口Stack ：
实现类：MyStack
public class MyStack implements Stack

并向这个栈中，压入5个英雄，接着弹出5个英雄

再解释一下栈: 栈的结构，就像给弹夹添加子弹一样，先添加的子弹，就放在了最下面，
打手枪的时候，只能从最上面取子弹。
 */

public class MyStack implements Stack {

    LinkedList<Hero> ll = new LinkedList<>();

    @Override
    public void push(Hero h) {
        ll.add(h);
    }

    @Override
    public Hero pull() {
        if(ll.size()==0){
            return null;
        }
        return ll.removeLast();
    }

    @Override
    public Hero peek() {
        return ll.get(ll.size()-1);
    }

    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(new Hero("盖伦"));
        ms.push(new Hero("提莫"));
        ms.push(new Hero("李青"));
        ms.push(new Hero("赏金"));
        System.out.println(ms.ll);
        System.out.println(ms.pull());
        System.out.println(ms.ll);
        System.out.println(ms.peek());
        System.out.println(ms.ll);

    }
}
