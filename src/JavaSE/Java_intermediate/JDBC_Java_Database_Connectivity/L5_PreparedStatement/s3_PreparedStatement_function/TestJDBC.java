package JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L5_PreparedStatement.s3_PreparedStatement_function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
PreparedStatement有预编译机制，性能比Statement更快
 */

public class TestJDBC {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "insert into hero values(null,?,?,?)";
        try (Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/how2java?useSSL=false" +
                        "&serverTimezone=UTC&allowPublicKeyRetrieval=true", //8.0版本
                "root",
                "srb86606212");
             Statement s = c.createStatement();
             PreparedStatement ps = c.prepareStatement(sql);
        ) {
            // Statement执行10次，需要10次把SQL语句传输到数据库端
            // 数据库要对每一次来的SQL语句进行编译处理
            for (int i = 0; i < 10; i++) {
                String sql0 = "insert into hero values(null," + "'提莫'" + ","
                        + 313.0f + "," + 50 + ")";
                s.execute(sql0);
            }
            s.close();

            // PreparedStatement 执行10次，只需要1次把SQL语句传输到数据库端
            // 数据库对带?的SQL进行预编译

            // 每次执行，只需要传输参数到数据库端
            // 1. 网络传输量比Statement更小
            // 2. 数据库不需要再进行编译，响应更快
            for (int i = 0; i < 10; i++) {
                ps.setString(1, "提莫");
                ps.setFloat(2, 313.0f);
                ps.setInt(3, 50);
                ps.execute();
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}