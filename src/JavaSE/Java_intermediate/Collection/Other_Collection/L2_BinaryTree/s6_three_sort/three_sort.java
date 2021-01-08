package JavaSE.Java_intermediate.Collection.Other_Collection.L2_BinaryTree.s6_three_sort;

import java.util.ArrayList;
import java.util.List;

/*
创建4万个随机数，然后用分别用冒泡法，选择法，二叉树3种排序算法进行排序，比较哪种更快
 */

class node{
    public node leftNode;
    public node rightNode;
    public Object root;
    public void add(Object v){
        if(root==null){
            root=v;
        }else{
            if((Integer)v-(Integer)root<=0){
                if(leftNode==null) {
                    leftNode = new node();
                }
                leftNode.add(v);
            }else{
                if(rightNode==null) {
                    rightNode = new node();
                }
                rightNode.add(v);
            }
        }
    }
    public List<Object> values(){
        List<Object> list=new ArrayList<>();
        if(null!=leftNode){
            list.addAll(leftNode.values());
        }
        list.add(root);
        if(null!=rightNode){
            list.addAll(rightNode.values());
        }
        return list;
    }
}
public class three_sort {
    public static void main(String[] args) {
        int[] arr = new int[40000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("这是冒泡排序排序"+arr.length+"个随机数的时间：");
        double starttime=System.currentTimeMillis();
        maopao_sort(arr);
        double spenttime=(System.currentTimeMillis()-starttime)/1000;
        System.out.println(spenttime+"s");
        System.out.println("这是选择排序排序"+arr.length+"个随机数的时间：");
        starttime=System.currentTimeMillis();
        xuanzhe_sort(arr);
        spenttime=(System.currentTimeMillis()-starttime)/1000;
        System.out.println(spenttime+"s");
        System.out.println("这是二叉树排序排序"+arr.length+"个随机数的时间：");
        starttime = System.currentTimeMillis();
        node tree = new node();
        for (int i = 0; i < arr.length; i++) {
            tree.add(arr[i]);
        }
        tree.values();
        spenttime = (System.currentTimeMillis() - starttime)/1000;
        System.out.println(spenttime + "s");
    }
    public static void maopao_sort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[j]<a[i]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
    }
    public static void xuanzhe_sort(int[] a){
        for(int i=0;i<a.length;i++){
            int index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[index]){
                    index=j;
                }
            }
            if(index!=i){
                int temp=a[index];
                a[index]=a[i];
                a[i]=temp;
            }
        }
    }
}