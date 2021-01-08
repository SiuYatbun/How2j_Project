package JavaSE.Java_intermediate.Lambda.L2_Method_reference.s4_reference_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/*
有的接口中的方法会返回一个对象，比如java.util.function.Supplier提供
了一个get方法，返回一个对象。

public interface Supplier<T> {
    T get();
}


设计一个方法，参数是这个接口

public static List getList(Supplier<List> s){
  return s.get();
}


为了调用这个方法，有3种方式
第一种匿名类：

Supplier<List> s = new Supplier<List>() {
	public List get() {
		return new ArrayList();
	}
};
List list1 = getList(s);


第二种：Lambda表达式
List list2 = getList(()->new ArrayList());


第三种：引用构造器
List list3 = getList(ArrayList::new);
 */

public class TestLambda {
    public static void main(String[] args) {
        Supplier<List> s = new Supplier<List>() {
            public List get() {
                return new ArrayList();
            }
        };

        //匿名类
        List list1 = getList(s);

        //Lambda表达式
        List list2 = getList(()->new ArrayList());

        //引用构造器
        List list3 = getList(ArrayList::new);

    }

    public static List getList(Supplier<List> s){
        return s.get();
    }

}