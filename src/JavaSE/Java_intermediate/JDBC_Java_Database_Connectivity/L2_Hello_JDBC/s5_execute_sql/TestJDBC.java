package JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L2_Hello_JDBC.s5_execute_sql;

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

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //8.0版本

            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/how2java?useSSL=false" +
                            "&serverTimezone=UTC&allowPublicKeyRetrieval=true", //8.0版本
                    "root",
                    "srb86606212");

            Statement s = c.createStatement();

            // 准备sql语句
            // 注意： 字符串要用单引号'
            String sql = "insert into hero values(null,"+"'佐伊'"+","+602.0f+","+58+")";
            s.execute(sql);

            System.out.println("执行插入语句成功");

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}