package JavaSE.Java_intermediate.Collection.Relation_and_Difference.L1_ArrayList_and_HashSet.s2_unique;

import java.util.ArrayList;
import java.util.HashSet;

/*
List中的数据可以重复
Set中的数据不能够重复
重复判断标准是:
首先看hashcode是否相同
如果hashcode不同，则认为是不同数据
如果hashcode相同，再比较equals，如果equals相同，则是相同数据，否则是不同数据
更多关系hashcode，请参考hashcode原理
 */

public class TestCollection {
    public static void main(String[] args) {

        ArrayList<Integer> numberList =new ArrayList<Integer>();
        //List中的数据可以重复
        System.out.println("----------List----------");
        System.out.println("向List 中插入 9 9");
        numberList.add(9);
        numberList.add(9);
        System.out.println("List 中出现两个9:");
        System.out.println(numberList);
        System.out.println("----------Set----------");
        HashSet<Integer> numberSet =new HashSet<Integer>();
        System.out.println("向Set 中插入9 9");
        //Set中的数据不能重复
        numberSet.add(9);
        numberSet.add(9);
        System.out.println("Set 中只会保留一个9:");
        System.out.println(numberSet);

    }
}