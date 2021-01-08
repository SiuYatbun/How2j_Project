package JavaSE.Java_intermediate.Collection.ArrayList.L2_method.s1_add;

/*
add 有两种用法
第一种是直接add对象，把对象加在最后面
heros.add(new Hero("hero " + i));


第二种是在指定位置加对象
heros.add(3, specialHero);
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