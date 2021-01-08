package JavaSE.Java_intermediate.Collection.Other_Collection.L3_HashMap.s3_two_sort;

import JavaSE.charactor.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
准备一个ArrayList其中存放3000000(三百万个)Hero对象，其名称是随机的,格式是hero-[4位随机数]
hero-3229
hero-6232
hero-9365
...

因为总数很大，所以几乎每种都有重复，把名字叫做 hero-5555的所有对象找出来
要求使用两种办法来寻找
1. 不使用HashMap，直接使用for循环找出来，并统计花费的时间
2. 借助HashMap，找出结果，并统计花费的时间
 */

public class TestCollection {


    public static void main(String[] args) {
        List<Hero> hs = new ArrayList<>();
        System.out.println("初始化开始");
        for(int i =0;i<3000000;i++)
        {
            Hero h = new Hero("hero-"+((int)(Math.random()*9000)+1000));
            hs.add(h);
        }
        HashMap<String,List<Hero>> heroMap = new HashMap<>();
        for(Hero h : hs)
        {
            List<Hero> list = heroMap.get(h.name);
            if(list==null)
            {
                list=new ArrayList<>();
                heroMap.put(h.name,list);
            }
            list.add(h);
        }
        System.out.println("初始化结束");
        System.out.println("开始查找");
        findByIteration(hs);
        findByMap(heroMap);

    }

    private static void findByMap(HashMap<String,List<Hero>> hm)
    {
        long start = System.currentTimeMillis();
        List<Hero> result= hm.get("hero-6666");
        long end = System.currentTimeMillis();
        System.out.println("通过map查找，一共找到个"+result.size()+"英雄，耗时"+
                (end-start)+"毫秒");
    }

    private static void findByIteration(List<Hero> hs)
    {
        long start = System.currentTimeMillis();
        List<Hero> result= new ArrayList<>();
        for(Hero h : hs)
        {
            if(h.name.equals("hero-6666"))
            {
                result.add(h);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("通过for查找，一共找到个"+result.size()+"英雄，耗时"+
                (end-start)+"毫秒");
    }


}
