package JavaSE.Java_elementary.Class_and_Object.L8_Class_method.s1_class_method;

/*
类方法： 又叫做静态方法

对象方法： 又叫实例方法，非静态方法

访问一个对象方法，必须建立在有一个对象的前提的基础上
访问类方法，不需要对象的存在，直接就访问
 */

public class Hero {
    public String name;
    protected float hp;

    //实例方法,对象方法，非静态方法
    //必须有对象才能够调用
    public void die(){
        hp = 0;
    }

    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("battle win");
    }

    public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "盖伦";
        //必须有一个对象才能调用
        garen.die();

        Hero teemo =  new Hero();
        teemo.name = "提莫";

        //无需对象，直接通过类调用
        Hero.battleWin();

    }
}
