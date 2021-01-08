package JavaSE.Java_intermediate.Collection.ArrayList.L2_method.s8_toArray;

/*
toArray可以把一个ArrayList对象转换为数组。
需要注意的是，如果要转换为一个Hero数组，那么需要传递一个Hero数组类型的对象给toArray()，
这样toArray方法才知道，你希望转换为哪种类型的数组，否则只能转换为Object数组
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