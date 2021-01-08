package JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L10_DAO_Data_Access_Object.s2_Interface_DAO;

/*
一个典型的DAO 模式主要由以下几部分组成。

1、DAO接口： 把对数据库的所有操作定义成抽象方法，可以提供多种实现。
2、实体类：用于存放与传输对象数据。
3、DAO 实现类： 针对不同数据库给出DAO接口定义方法的具体实现。也可以把数据库连接和关闭写在该实现类种，
这样的好处是：避免了数据库连接和关闭代码的重复使用，方便修改。
4.测试类：用于创建实例对象调用方法。
 */

import java.sql.SQLException;
import java.util.List;

public class TestJDBC {
    public static void main(String[] args) throws SQLException {
        HeroDAO hd = new HeroDAO();
//      System.out.println(hd.getTotal());
        Hero h = new Hero();
        List<Hero> heros = hd.list(0,5);
        for(int i=0;i<heros.size();i++){
            System.out.println(heros.get(i).getName());
        }

    }
}
