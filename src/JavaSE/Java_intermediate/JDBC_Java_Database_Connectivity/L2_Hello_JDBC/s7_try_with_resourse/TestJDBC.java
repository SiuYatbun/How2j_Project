package JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L2_Hello_JDBC.s7_try_with_resourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
如果觉得上一步的关闭连接的方式很麻烦，可以参考关闭流的方式，
使用try-with-resource的方式自动关闭连接，因为Connection和Statement都实现了AutoCloseable接口
 */
public class TestJDBC {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                Connection c = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/how2java?useSSL=false" +
                        "&serverTimezone=UTC&allowPublicKeyRetrieval=true", //8.0版本
                        "root",
                        "srb86606212");
                Statement s = c.createStatement();
        )  //try-with-resource -> try()
        {
            String sql = "insert into hero values(null," + "'布隆'" + "," + 582.0f + "," + 59 + ")";
            s.execute(sql);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}