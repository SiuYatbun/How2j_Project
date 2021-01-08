package JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L6_executeANDexecuteUpdate.s2_differences;

/*不同1：
execute可以执行查询语句，然后通过getResultSet，把结果集取出来
executeUpdate不能执行查询语句

不同2:
execute返回boolean类型，true表示执行的是查询语句，false表示执行的是insert,delete,update等等
executeUpdate返回的是int，表示有多少条数据受到了影响
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

            // 不同1：execute可以执行查询语句
            // 然后通过getResultSet，把结果集取出来
            String sqlSelect = "select * from hero";

            s.execute(sqlSelect);
            ResultSet rs = s.getResultSet();   //等同于ResultSet rs = s.executeQuery(sqlSelect);
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
            }

            // executeUpdate不能执行查询语句
//             s.executeUpdate(sqlSelect);

            // 不同2:
            // execute返回boolean类型，true表示执行的是查询语句，false表示执行的是insert,delete,update等等
            boolean isSelect = s.execute(sqlSelect);
            System.out.println(isSelect);

            // executeUpdate返回的是int，表示有多少条数据受到了影响
            String sqlUpdate = "update Hero set hp = 556 where id = 10";
            int number = s.executeUpdate(sqlUpdate);
            System.out.println(number);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}