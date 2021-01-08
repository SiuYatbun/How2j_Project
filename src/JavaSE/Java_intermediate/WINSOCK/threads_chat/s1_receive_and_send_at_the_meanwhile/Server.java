package JavaSE.Java_intermediate.WINSOCK.threads_chat.s1_receive_and_send_at_the_meanwhile;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
在练习-服务端和客户端互聊 中，只能一人说一句，说了之后，必须等待另一个人的回复，才能说下一句。

这是因为接受和发送都在主线程中，不能同时进行。 为了实现同时收发消息，基本设计思路是把收发分别放在不同的线程中进行

1. SendThread：发送消息线程
2. RecieveThread：接受消息线程
3. Server：一旦接受到连接，就启动收发两个线程
4. Client：一旦建立了连接，就启动收发两个线程
 */

public class Server {

    public static void main(String[] args) {
        try {

            ServerSocket ss = new ServerSocket(8888);

            System.out.println("监听在端口号:8888");
            Socket s = ss.accept();

            //启动发送消息线程
            new SendThread(s).start();
            //启动接受消息线程
            new ReceiveThread(s).start();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}