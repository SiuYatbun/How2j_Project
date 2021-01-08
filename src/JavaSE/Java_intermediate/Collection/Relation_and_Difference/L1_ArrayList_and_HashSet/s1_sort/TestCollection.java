package JavaSE.Java_intermediate.Collection.Relation_and_Difference.L1_ArrayList_and_HashSet.s1_sort;

import java.util.ArrayList;
import java.util.HashSet;

/*
ArrayList: 有顺序
HashSet: 无顺序

HashSet的具体顺序，既不是按照插入顺序，也不是按照hashcode的顺序。关于hashcode有专门的章节讲解: hashcode 原理。

以下是HasetSet源代码中的部分注释：
* It makes no guarantees as to the iteration order of the set;
* in particular, it does not guarantee that the order will remain constant over time.

不保证Set的迭代顺序; 确切的说，在不同条件下，元素的顺序都有可能不一样
换句话说，同样是插入0-9到HashSet中， 在JVM的不同版本中，看到的顺序都是不一样的。
所以在开发的时候，不能依赖于某种臆测的顺序，这个顺序本身是不稳定的
 */
public class TestCollection {
    public static void main(String[] args) {

        ArrayList<Integer> numberList =new ArrayList<Integer>();
        //List中的数据按照插入顺序存放
        System.out.println("----------List----------");
        System.out.println("向List 中插入 9 5 1");
        numberList.add(9);
        numberList.add(5);
        numberList.add(1);
        System.out.println("List 按照顺序存放数据:");
        System.out.println(numberList);
        System.out.println("----------Set----------");
        HashSet<Integer> numberSet =new HashSet<Integer>();
        System.out.println("向Set 中插入9 5 1");
        //Set中的数据不是按照插入顺序存放
        numberSet.add(9);
        numberSet.add(5);
        numberSet.add(1);
        System.out.println("Set 不是按照顺序存放数据:");
        System.out.println(numberSet);

    }
}
