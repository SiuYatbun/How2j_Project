package JavaSE.Java_intermediate.Collection.ArrayList.L2_method.s5_remove;

/*
remove用于把对象从ArrayList中删除
remove可以根据下标删除ArrayList的元素
heros.remove(2);


也可以根据对象删除
heros.remove(specialHero);
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