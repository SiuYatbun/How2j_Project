package JavaSE.Java_intermediate.Collection.ArrayList.L2_method.s2_contains;

/*
通过方法contains 判断一个对象是否在容器中
判断标准： 是否是同一个对象，而不是name是否相同
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