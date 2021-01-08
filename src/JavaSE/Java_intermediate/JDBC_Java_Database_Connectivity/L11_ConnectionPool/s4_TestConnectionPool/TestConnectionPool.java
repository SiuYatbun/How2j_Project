package JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L11_ConnectionPool.s4_TestConnectionPool;

import JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L11_ConnectionPool.s3_constructionANDinitialization.ConnectionPool;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
首先初始化一个有3条连接的数据库连接池
然后创建100个线程，每个线程都会从连接池中借用连接，并且在借用之后，归还连接。 拿到连接之后，执行一个耗时1秒的SQL语句。

运行程序，就可以观察到如图所示的效果
 */

public class TestConnectionPool {

    public static void main(String[] args) {
        ConnectionPool cp = new ConnectionPool(3);
        for (int i = 0; i < 100; i++) {
            new WorkingThread("working thread" + i, cp).start();
        }

    }
}

class WorkingThread extends Thread {
    private ConnectionPool cp;

    public WorkingThread(String name, ConnectionPool cp) {
        super(name);
        this.cp = cp;
    }

    public void run() {
        Connection c = cp.getConnection();
        System.out.println(this.getName()+ ":\t 获取了一根连接，并开始工作"  );
        try (Statement st = c.createStatement()
        ){

            //模拟时耗1秒的数据库SQL语句
            Thread.sleep(1000);
            st.execute("select * from hero");


        } catch (SQLException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        cp.returnConnection(c);
    }
}

