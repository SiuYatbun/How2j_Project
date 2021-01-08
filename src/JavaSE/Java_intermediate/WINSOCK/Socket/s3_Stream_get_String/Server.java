package JavaSE.Java_intermediate.WINSOCK.Socket.s3_Stream_get_String;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
直接使用字节流收发字符串比较麻烦，使用数据流对字节流进行封装，这样收发字符串就容易了
1. 把输出流封装在DataOutputStream中
使用writeUTF发送字符串 "Legendary!"
2. 把输入流封装在DataInputStream
使用readUTF读取字符串,并打印
 */

public class Server {

    public static void main(String[] args) {
        try {

            ServerSocket ss = new ServerSocket(8888);

            System.out.println("监听在端口号:8888");
            Socket s = ss.accept();

            InputStream is = s.getInputStream();

            //把输入流封装在DataInputStream
            DataInputStream dis = new DataInputStream(is);

            //使用readUTF读取字符串
            String msg = dis.readUTF();
            System.out.println(msg);

            dis.close();
            //s.close();
            ss.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}