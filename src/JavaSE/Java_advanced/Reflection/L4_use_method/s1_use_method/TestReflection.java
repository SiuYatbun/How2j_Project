package JavaSE.Java_advanced.Reflection.L4_use_method.s1_use_method;

import java.lang.reflect.Method;

import JavaSE.charactor.Hero;

/*
首先为Hero的name属性，增加setter和getter
通过反射机制调用Hero的setName
 */

public class TestReflection {

    public static void main(String[] args) {
        Hero h = new Hero();

        try {
            // 获取这个名字叫做setName，参数类型是String的方法
            Method m = h.getClass().getMethod("setName", String.class);
            // 对h对象，调用这个方法
            m.invoke(h, "盖伦");
            // 使用传统的方式，调用getName方法
            System.out.println(h.getName());

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
