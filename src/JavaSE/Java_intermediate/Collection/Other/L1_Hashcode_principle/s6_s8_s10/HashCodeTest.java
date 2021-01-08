package JavaSE.Java_intermediate.Collection.Other.L1_Hashcode_principle.s6_s8_s10;

import java.util.*;

/*
步骤 6 : 练习-自定义字符串的hashcode
如下是Java API提供的String的hashcode生成办法；
s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]

s[0] 表示第一位字符
n表示字符串的长度
本练习并不是要求去理解这个算法，而是自定义一个简单的hashcode算法，计算任意字符串的hashcode
因为String类不能被重写，所以我们通过一个静态方法来返回一个String的hashcode

public static int hashcode(String)

如果字符串长度是0，则返回0。
否则： 获取每一位字符，转换成数字后，相加，最后乘以23
(s[0]+ s[1] + s[2] + s[3]+ s[n-1])*23.

如果值超过了1999，则取2000的余数，保证落在0-1999之间。
如果是负数，则取绝对值。

随机生成长度是2-10的不等的100个字符串，打印用本hashcode获取的值分别是多少
 */


/*
步骤 8 : 练习-自定义MyHashMap
根据前面学习的hashcode的原理和自定义hashcode, 设计一个MyHashMap，实现接口IHashMap

MyHashMap内部由一个长度是2000的对象数组实现。

设计put(String key,Object value)方法
首先通过上一个自定义字符串的hashcode练习获取到该字符串的hashcode,
然后把这个hashcode作为下标，定位到数组的指定位置。
如果该位置没有数据，则把字符串和对象组合成键值对Entry，再创建一个LinkedList，把键值对，放进LinkedList中，
最后把LinkedList 保存在这个位置。
如果该位置有数据，一定是一个LinkedList,则把字符串和对象组合成键值对Entry，插入到LinkedList后面。

设计 Object get(String key) 方法
首先通过上一个自定义字符串的hashcode练习获取到该字符串的hashcode,然后把这个hashcode作为下标，定位到数组的指定位置。
如果这个位置没有数据，则返回空
如果这个位置有数据，则挨个比较其中键值对的键-字符串，是否equals，找到匹配的，把键值对的值，返回出去。
找不到匹配的，就返回空
 */


/*
步骤 10 : 练习-内容查找性能比较
重复前面的 练习-查找内容性能比较 ，不过不使用HashMap,而是使用上个练习中自定义的MyHashMap.

准备一个ArrayList其中存放100000(十万个)Hero对象，其名称是随机的,格式是hero-[4位随机数]
hero-3229
hero-6232
hero-9365
...

因为总数很大，所以几乎每种都有重复，把名字叫做 hero-5555的所有对象找出来
要求使用两种办法来寻找
1. 不使用MyHashMap，直接使用for循环找出来，并统计花费的时间
2. 借助MyHashMap，找出结果，并统计花费的时间
 */


/**
 * 1)自定义字符串的hashcode
 *   随机生成长度是2-10的不等的100个字符串，打印用本hashcode获取的值分别是多少
 * 2)自定义MyHashMap
 * 3)性能比较
 *   1. 不使用MyHashMap，直接使用for循环找出来，并统计花费的时间
 *   2. 借助MyHashMap，找出结果，并统计花费的时间
 */

public class HashCodeTest {
    public static void main(String[] args) {

        //输出100个字符的hashcode
        for (int i = 0; i < 100; i++) {
            char[] chars = new char[ranLen()];
            for (int j = 0; j < chars.length; j++) {
                chars[j] = ranCh();
            }
            String str = String.valueOf(chars);
            System.out.println(str + " 的hashcode：" + hashcode(str));
        }
        System.out.println("-----------------------------------");


        //性能测试
        MyHashMap myHashMap = new MyHashMap();
        ArrayList<Student> arrayList= new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int tmp = random.nextInt(8999) + 1000;
            Student student = new Student("student-" + tmp);
            arrayList.add(student);
            myHashMap.put(student.name,student);
        }
        System.out.println(selArr(arrayList));
        System.out.println(selMap(arrayList));
    }


    //array性能测试
    public static double selArr(ArrayList<Student> arrayList){
        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).name.equals("student-5555")){
                System.out.println("找到student对象：" + arrayList.get(i).name);
            }
        }
        long end = System.currentTimeMillis();
        return (end-start)/1.0;
    }


    //map性能测试
    public static double selMap(ArrayList<Student> arrayList){
        MyHashMap myHashMap = new MyHashMap();
        for (int i = 0; i < arrayList.size(); i++) {
            myHashMap.put(arrayList.get(i).name,arrayList.get(i));
        }
        long start = System.currentTimeMillis();
        System.out.println(myHashMap.get("student-5555"));
        long end = System.currentTimeMillis();
        return (end-start)/1.0;
    }


    //随机生成的长度
    public static int ranLen(){
        Random random = new Random();
        return random.nextInt(8) + 2;
    }


    //随机生成一个字符
    public static char ranCh(){
        Random random = new Random();
        //假设字符是由大小写和数字构成
        char ch;
        //判断获取的是数字还是字母,数字概率是10/62,字母概率52/62
        if(random.nextInt(62) > 10){
            //判断大小写
            if(random.nextInt(2)%2 == 0){
                ch = (char)(random.nextInt(26) + 65);
            }
            else
                ch = (char)(random.nextInt(26) + 97);
        }else {
            ch = (char)(random.nextInt(10) + 48);
        }
        return ch;
    }


    public static int hashcode(String s){
        char[] chars = s.toCharArray();
        int hashcode = 0;
        //获取每一位字符
        for (int i = 0; i < s.length()-1; i++) {
            hashcode += chars[i];
        }
        hashcode = hashcode + chars[s.length()-1] * 23;
        if(hashcode >= 2000) hashcode = hashcode%2000;
        return hashcode;
    }

}


//自定义hashmap
class MyHashMap implements IHashMap {

    //根据题目要求，创建一个由LinkedList集合构成的数组，LinkedList里存放的是Entry键值对
    LinkedList<Entry>[] a;
    public MyHashMap() {
        a =  new LinkedList[2000];
    }

    //myhashmap使用put添加和hashmap略微不同，hashmap键不能重复，所以相同的的键无法加入。
    // 而myhashmap可以把相同的键加入到链表
    @Override
    public void put(String key, Object object) {
        if(a[hashcode(key)] == null){
            Entry entry = new Entry(key,object);
            a[hashcode(key)] = new LinkedList();
            a[hashcode(key)].add(entry);
        }
        else {
            Entry entry = new Entry(key,object);
            a[hashcode(key)].add(entry);
        }
    }

    @Override
    public Object get(String key) {
        int index = hashcode(key);
        if(a[index] == null)
            return null;
        else{
            //这里使用迭代器
            ListIterator<Entry> listIterator=a[index].listIterator();
            Entry entry;
            //使用LinkedList链表保存需要返回的值
            LinkedList<Entry> linkedList = new LinkedList<>();
            while (listIterator.hasNext()){
                if((entry = listIterator.next()).key.equals(key))
                    linkedList.add(entry);
            }
            return linkedList;
        }
    }

    //这个同上一个hascode方法
    public static int hashcode(String s){
        char[] chars = s.toCharArray();
        int hashcode = 0;
        //获取每一位字符
        for (int i = 0; i < s.length()-1; i++) {
            hashcode += chars[i];
        }
        hashcode = hashcode + chars[s.length()-1] * 23;
        if(hashcode >= 2000)
            hashcode = hashcode%2000;
        return hashcode;
    }
}


interface IHashMap {
    void put(String key,Object object);
    Object get(String key);
}


class Entry {
    public Entry(String key, Object value) {
        super();
        this.key = key;
        this.value = value;
    }
    public String key;
    public Object value;
    @Override
    public String toString() {
        return "[key=" + key + ", value=" + value + "]\n";
    }
}


class Student{
    String name;
    public Student(String name) {
        this.name = name;
    }
}