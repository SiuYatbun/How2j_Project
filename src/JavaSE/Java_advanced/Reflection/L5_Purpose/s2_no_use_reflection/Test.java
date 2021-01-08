package JavaSE.Java_advanced.Reflection.L5_Purpose.s2_no_use_reflection;

import JavaSE.Java_advanced.Reflection.L5_Purpose.s1_Service_Class.Service2;

/*
当需要从第一个业务方法切换到第二个业务方法的时候，使用非反射方式，必须修改代码，并且重新编译运行，才可以达到效果
 */

public class Test {

    public static void main(String[] args) {
        //      new JavaSE.Java_advanced.Reflection.L5_Purpose.s1_Service_Class.Service1().doService1();
        new Service2().doService2();
    }
}
