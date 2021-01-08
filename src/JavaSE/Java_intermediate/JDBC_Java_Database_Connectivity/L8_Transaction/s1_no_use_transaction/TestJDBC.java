package JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L8_Transaction.s1_no_use_transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
没有事务的前提下
假设业务操作是：加血，减血各做一次
结束后，英雄的血量不变
而减血的SQL
不小心写错写成了 updata(而非update)
那么最后结果是血量增加了，而非期望的不变
 */

public class TestJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/how2java?useSSL=false" +
                        "&serverTimezone=UTC&allowPublicKeyRetrieval=true", //8.0版本
                "root",
                "srb86606212");
             Statement s = c.createStatement();
             ) {

            //没有事务的前提下
            //假设业务操作时，加血，减血各做一次
            //结束后，英雄的血量不变

            //加血的SQL
            String sql1 = "update hero set hp = hp +1 where id = 5";
            s.execute(sql1);

            //减血的SQL
            //不小心写错写成了 updata(而非update)

            String sql2 = "updata hero set hp = hp -1 where id = 5";
            s.execute(sql2);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}