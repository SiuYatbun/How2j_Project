package JavaSE.Java_advanced.Reflection.L2_Create_object.s1_create_object;

import java.lang.reflect.Constructor;
import JavaSE.charactor.Hero;

/*
通过反射机制创建一个对象
 */

public class TestReflection {

    public static void main(String[] args) {
        //传统的使用new的方式创建对象
        Hero h1 =new Hero();
        h1.name = "teemo";
        System.out.println(h1);

        try {
            //使用反射的方式创建对象
            String className = "JavaSE.charactor.Hero";
            //类对象
            Class pClass=Class.forName(className);
            //构造器
            Constructor c= pClass.getConstructor();
            //通过构造器实例化
            Hero h2= (Hero) c.newInstance();
            h2.name="gareen";
            System.out.println(h2);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
