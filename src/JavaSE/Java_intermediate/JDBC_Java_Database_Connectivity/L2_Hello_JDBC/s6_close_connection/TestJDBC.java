package JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L2_Hello_JDBC.s6_close_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
s.execute执行sql语句
执行成功后，用mysql-front进行查看，明确插入成功

执行SQL语句之前要确保数据库how2java中有表hero的存在，如果没有，需要事先创建表
 */

public class TestJDBC {
    public static void main(String[] args) {

        Connection c = null;
        Statement s = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //8.0版本

            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/how2java?useSSL=false" +
                            "&serverTimezone=UTC&allowPublicKeyRetrieval=true", //8.0版本
                    "root",
                    "srb86606212");

            s = c.createStatement();

            String sql = "insert into hero values(null," + "'杰斯'" + "," + 593.0f + "," + 70 + ")";

            s.execute(sql);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // 数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
            // 先关闭Statement
            if (s != null)
                try {
                    s.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            // 后关闭Connection
            if (c != null)
                try {
                    c.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            System.out.println("完成操作，已断开连接数据库");
        }

    }
}