package JavaSE.Java_advanced.Reflection.L1_get_Class_object.s3_get_Class_object_will_initialize_Class_property;

import JavaSE.charactor.Hero;

/*
为Hero增加一个静态属性,并且在静态初始化块里进行初始化，参考 类属性初始化。

static String copyright;
static {
    System.out.println("初始化 copyright");
    copyright = "版权由Riot Games公司所有";
}


无论什么途径获取类对象，都会导致静态属性被初始化，而且只会执行一次。（除了直接使用 Class c = Hero.class 这种方式，这种方式不会导致静态属性被初始化）
 */

public class TestReflection {

    public static void main(String[] args) {
        String className = "JavaSE.charactor.Hero";
        try {
            Class pClass1=Class.forName(className);
            Class pClass3=new Hero().getClass();

            Class pClass2=Hero.class; //不会初始化类属性

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
