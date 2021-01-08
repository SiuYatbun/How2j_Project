package JavaSE.Java_intermediate.Collection.ArrayList.L2_method.s4_indexOf;

/*
indexOf用于判断一个对象在ArrayList中所处的位置
与contains一样，判断标准是对象是否相同，而非对象的name值是否相等
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