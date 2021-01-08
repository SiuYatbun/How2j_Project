package JavaSE.Java_intermediate.Collection.ArrayList.L2_method.s3_get;

/*
通过get获取指定位置的对象，如果输入的下标越界，一样会报错
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