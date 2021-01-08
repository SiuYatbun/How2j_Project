package JavaSE.Java_intermediate.Collection.Other_Collection.L6_Collections.s6_synchronizedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
synchronizedList 把非线程安全的List转换为线程安全的List。
 */

public class TestCollection {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        System.out.println("把非线程安全的List转换为线程安全的List");
        List<Integer> synchronizedNumbers = (List<Integer>) Collections.synchronizedList(numbers);

    }
}
