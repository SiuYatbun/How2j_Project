package JavaSE.Java_intermediate.Collection.Relation_and_Difference.L2_ArrayList_and_LinkList.s3_get;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
定位数据
 */

public class TestCollection {
    public static void main(String[] args) {
        List<Integer> l;
        l = new ArrayList<>();
        modify(l, "ArrayList");

        l = new LinkedList<>();
        modify(l, "LinkedList");

    }

    private static void modify(List<Integer> l, String type) {
        int total = 100 * 100;
        int index = total/2;
        final int number = 5;
        //初始化
        for (int i = 0; i < total; i++) {
            l.add(number);
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < total; i++) {
            int n = l.get(index);
            n++;
            l.set(index, n);
        }
        long end = System.currentTimeMillis();
        System.out.printf("%s总长度是%d，定位到第%d个数据，取出来，加1，再放回去%n 重复%d遍，总共耗时 %d 毫秒 %n", type,total, index,total, end - start);
        System.out.println();
    }

}