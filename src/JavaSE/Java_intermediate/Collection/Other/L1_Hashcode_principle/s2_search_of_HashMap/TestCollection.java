package JavaSE.Java_intermediate.Collection.Other.L1_Hashcode_principle.s2_search_of_HashMap;

import java.util.HashMap;

import JavaSE.charactor.Hero;

/*
使用HashMap 做同样的查找
1. 初始化2000000个对象到HashMap中。
2. 进行10次查询
3. 统计每一次的查询消耗的时间
可以观察到，几乎不花时间，花费的时间在1毫秒以内
 */

public class TestCollection {
    public static void main(String[] args) {

        HashMap<String,Hero> heroMap = new HashMap<String,Hero>();
        for (int j = 0; j < 2000000; j++) {
            Hero h = new Hero("Hero " + j);
            heroMap.put(h.name, h);
        }
        System.out.println("数据准备完成");

        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();

            //查找名字是Hero 1000000的对象
            Hero target = heroMap.get("Hero 1000000");
            System.out.println("找到了 hero!" + target.name);

            long end = System.currentTimeMillis();
            long elapsed = end - start;
            System.out.println("一共花了：" + elapsed + " 毫秒");
        }

    }
}
