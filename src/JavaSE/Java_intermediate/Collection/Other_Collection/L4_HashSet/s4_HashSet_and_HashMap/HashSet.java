package JavaSE.Java_intermediate.Collection.Other_Collection.L4_HashSet.s4_HashSet_and_HashMap;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
通过观察HashSet的源代码（如何查看源代码）
可以发现HashSet自身并没有独立的实现，而是在里面封装了一个Map.
HashSet是作为Map的key而存在的
而value是一个命名为PRESENT的static的Object对象，因为是一个类属性，所以只会有一个。

private static final Object PRESENT = new Object();
 */

public class HashSet<E>
        extends AbstractSet<E>
        implements Set<E>, Cloneable, java.io.Serializable {

    //HashSet里封装了一个HashMap
    private  HashMap<E,Object> map;

    private static final Object PRESENT = new Object();

    //HashSet的构造方法初始化这个HashMap
    public HashSet() {
        map = new HashMap<E,Object>();
    }

    //向HashSet中增加元素，其实就是把该元素作为key，增加到Map中
    //value是PRESENT，静态，final的对象，所有的HashSet都使用这么同一个对象
    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }

    //HashSet的size就是map的size
    public int size() {
        return map.size();
    }

    //清空Set就是清空Map
    public void clear() {
        map.clear();
    }

    //迭代Set,就是把Map的键拿出来迭代
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

}
