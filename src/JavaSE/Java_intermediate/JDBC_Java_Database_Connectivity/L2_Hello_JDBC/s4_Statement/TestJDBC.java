package JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L2_Hello_JDBC.s4_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
Statement是用于执行SQL语句的，比如增加，删除
 */

public class TestJDBC {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //8.0版本

            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/how2java?useSSL=false" +
                            "&serverTimezone=UTC&allowPublicKeyRetrieval=true", //8.0版本
                    "root",
                    "srb86606212");

            // 注意：使用的是 java.sql.Statement
            // 不要不小心使用到： com.mysql.jdbc.Statement;
            Statement s = c.createStatement();

            System.out.println("获取 Statement对象： " + s);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}