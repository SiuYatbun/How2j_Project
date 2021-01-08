package JavaSE.Java_intermediate.WINSOCK.IPAddress_AND_Port.s5_use_java_to_ping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
借助 Runtime.getRuntime().exec() 可以运行一个windows的exe程序
如图，使用java运行ping 172.20.10.225，返回这样的字符串
 */

public class TestSocket {

    public static void main(String[] args) throws IOException {

        Process p = Runtime.getRuntime().exec("ping" + " " + "172.20.10.3");
                                                    //ping指令和地址之间有个空格" "
        BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream(),"GBK"));
                                                    //编码规则默认值为UTF-8，要修改为GBK
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            if (line.length() != 0)
                sb.append(line + "\r\n");  //读一行+换行
        }
        System.out.println("本次指令返回的消息是：");
        System.out.println(sb.toString());
    }

}