package JavaSE.Java_intermediate.WINSOCK.Socket.s5_Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket("127.0.0.1", 8888);

        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        while(true){
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            dos.writeUTF(str);
            String msg = dis.readUTF();
            System.out.println("收到服务端信息"+msg);
        }
    }
}
