package JavaSE.Java_intermediate.WINSOCK.IPAddress_AND_Port.s3_IP_address;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
步骤 1 : IP地址
在网络中每台计算机都必须有一个的IP地址；
32位，4个字节，常用点分十进制的格式表示，例如：192.168.1.100
127.0.0.1 是固定ip地址，代表当前计算机，相当于面向对象里的 "this"
 */

/*
步骤 2 : 端口
两台计算机进行连接，总有一台服务器，一台客户端。
服务器和客户端之间的通信通过端口进行。如图：

ip地址是 192.168.1.100的服务器通过端口：8080
与ip地址是192.168.1.189的客户端的1087端口通信
 */

/*
获取本机IP地址
 */

public class TestSocket {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
//        System.out.println(host);
        String ip =host.getHostAddress();
        System.out.println("本机ip地址：" + ip);
        StringBuilder sb = new StringBuilder(ip);
        sb.substring(0,ip.lastIndexOf('.')+1);
        System.out.println(sb);
    }
}
