package JavaSE.Java_intermediate.Collection.ArrayList.L3_Interface_List.s1_ArrayList_and_List;

/*
ArrayList实现了接口List
常见的写法会把引用声明为接口List类型
注意：是java.util.List,而不是java.awt.List

因为ArrayList实现了List接口，所以List接口的方法ArrayList都实现了。
在ArrayList 常用方法章节有详细的讲解，在此不作赘述
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