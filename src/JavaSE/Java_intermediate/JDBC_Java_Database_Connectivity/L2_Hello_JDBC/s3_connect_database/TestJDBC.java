package JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L2_Hello_JDBC.s3_connect_database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
建立与数据库的Connection连接
这里需要提供：
数据库所处于的ip:127.0.0.1 (本机)
数据库的端口号： 3306 （mysql专用端口号）
数据库名称 how2java
编码方式 UTF-8
账号 root
密码 srb86606212


注： 这一步要成功执行，必须建立在mysql中有数据库how2java的基础上，如果没有，点击创建数据库查看如何进行数据库的创建。
 */


public class TestJDBC {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //8.0版本

            // 建立与数据库的Connection连接
            // 这里需要提供：
            // 数据库所处于的ip:127.0.0.1 (本机)(localhost)
            // 数据库的端口号： 3306 （mysql专用端口号）
            // 数据库名称 how2java
            // 编码方式 UTF-8
            // 账号 root
            // 密码 srb86606212

            Connection c = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/how2java?useSSL=false" +
                                    "&serverTimezone=UTC&allowPublicKeyRetrieval=true", //8.0版本
                            "root",
                            "srb86606212");

            System.out.println("连接成功，获取连接对象： " + c);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}