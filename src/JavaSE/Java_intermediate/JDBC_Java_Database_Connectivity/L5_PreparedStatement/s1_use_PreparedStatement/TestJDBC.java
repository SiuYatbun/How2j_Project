package JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L5_PreparedStatement.s1_use_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
和 Statement一样，PreparedStatement也是用来执行sql语句的
与创建Statement不同的是，需要根据sql语句创建PreparedStatement
除此之外，还能够通过设置参数，指定相应的值，而不是Statement那样使用字符串拼接

注： 这是JAVA里唯二的基1的地方，另一个是查询语句中的ResultSet也是基1的。
 */
public class TestJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "insert into hero values(null,?,622.0,?)";
        try (Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/how2java?useSSL=false" +
                        "&serverTimezone=UTC&allowPublicKeyRetrieval=true", //8.0版本
                "root",
                "srb86606212");
             // 根据sql语句创建PreparedStatement
             PreparedStatement ps = c.prepareStatement(sql);
        ) {

            // 设置参数
            ps.setString(1, "猪妹");

            ps.setInt(2, 64);      //parameterindex看
                                                    //String sql = "insert into hero values(null,?,622.0,?)";
                                                    //中的?
            // 执行
            ps.execute();
            System.out.println("数据插入成功");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}