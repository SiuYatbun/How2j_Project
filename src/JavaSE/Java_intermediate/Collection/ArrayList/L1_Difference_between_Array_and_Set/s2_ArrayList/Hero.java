package JavaSE.Java_intermediate.Collection.ArrayList.L1_Difference_between_Array_and_Set.s2_ArrayList;

/*
如果要存放多个对象，可以使用数组，但是数组有局限性
比如 声明长度是10的数组
不用的数组就浪费了
超过10的个数，又放不下
 */

public class Hero {
    public String name;
    public float hp;

    public int damage;

    public Hero() {

    }

    // 增加一个初始化name的构造方法
    public Hero(String name) {

        this.name = name;
    }

    // 重写toString方法
    public String toString() {
        return name;
    }

}