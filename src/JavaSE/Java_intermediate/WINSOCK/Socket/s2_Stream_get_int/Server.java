package JavaSE.Java_intermediate.WINSOCK.Socket.s2_Stream_get_int;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
一旦建立了连接，服务端和客户端就可以通过Socket进行通信了
1. 客户端打开输出流，并发送数字 110
2. 服务端打开输入流，接受数字 110，并打印
 */

public class Server {

    public static void main(String[] args) {
        try {

            ServerSocket ss = new ServerSocket(8888);

            System.out.println("监听在端口号:8888");
            Socket s = ss.accept();

            //打开输入流
            InputStream is = s.getInputStream();

            //读取客户端发送的数据
            int msg = is.read();
            //打印出来
            System.out.println(msg);
            is.close();

            s.close();
            ss.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}