package JavaSE.Java_intermediate.WINSOCK.Socket.s4_use_Scanner;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

            Socket s = new Socket("127.0.0.1", 8888);

            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            //使用Scanner读取控制台的输入，并发送到服务端
            while(true) {
                Scanner sc = new Scanner(System.in);
                String str = sc.next();
                dos.writeUTF(str);
                if(str.equals("886")){
                    break;
                }
            }
            dos.close();
            s.close();
    }
}