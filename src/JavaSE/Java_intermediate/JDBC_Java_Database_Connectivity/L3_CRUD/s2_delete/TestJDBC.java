package JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L3_CRUD.s2_delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
删除和增加很类似，只不过是执行的SQL语句不一样罢了
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
            String sql = "delete from hero where id = 5";
            s.execute(sql);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}