package JavaSE.Java_intermediate.WINSOCK.Socket.s5_Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
DataInputStream流不好用
 */

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(8888);

        System.out.println("监听在端口号:8888");
        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        while (true) {
            String msg = dis.readUTF();
               System.out.println("收到客户端信息"+msg);
               Scanner sc = new Scanner(System.in);
               String str = sc.next();
               dos.writeUTF(str);
        }
    }
}