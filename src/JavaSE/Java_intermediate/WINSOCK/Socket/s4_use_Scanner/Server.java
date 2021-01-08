package JavaSE.Java_intermediate.WINSOCK.Socket.s4_use_Scanner;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
在上个步骤中，每次要发不同的数据都需要修改代码
可以使用Scanner读取控制台的输入，并发送到服务端，这样每次都可以发送不同的数据了。
 */

public class Server {

    public static void main(String[] args) throws IOException {


            ServerSocket ss = new ServerSocket(8888);

            System.out.println("监听在端口号:8888");
            Socket s = ss.accept();

            InputStream is = s.getInputStream();

            //把输入流封装在DataInputStream
            DataInputStream dis = new DataInputStream(is);
            //使用readUTF读取字符串
            String msg = null;
            while((msg = dis.readUTF()) != null){
                System.out.println(msg);
                if(msg.equals("886")){
                    break;
                }
            }



            dis.close();
            //s.close();
            ss.close();

    }
}