package JavaSE.Java_intermediate.WINSOCK.IPAddress_AND_Port.s6_determine_how_many_can_use;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/*
首先获取获取本机IP地址，比如说是172.20.10.2。
那么本网段的ip地址就是从 172.20.10.1 到 172.20.10.255
再通过使用java 执行ping命令 判断这些ip地址能否使用，把能够使用的ip打印出来

为了提高效率，使用多线程方式同时ping。 但是如果开启255个线程，又会因为网络端口太拥挤，会被判定为无法ping通。
所以本例使用java自带线程池，线程池的连接数还不能太大，启动了15个线程。

等待所有的线程结束后打印出ping通了的ip地址。
 */

public class TestSocket {
    public static void main(String[] args) throws IOException, InterruptedException {
        InetAddress host = InetAddress.getLocalHost(); //建立一个本机对象
        String ip = host.getHostAddress();             //获取本机id
        System.out.println("本机的ip地址是："+ip);
        StringBuilder ip_pre = new StringBuilder(ip.substring(0,ip.lastIndexOf('.')));
                                             //用substring方法得到ip前面部分

        List<String> ips = Collections.synchronizedList(new ArrayList<>());
                                        //把ArrayList类中的所有方法设为同步方法
        //建立线程池
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                10,15,60,
                TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        /*
        第一个参数100:表示这个线程池初始化了100个线程在里面工作
        第二个参数150:表示如果100个线程不够用了，就会自动增加到最多150个线程
        第三个参数10:结合第四个参数TimeUnit.SECONDS，表示经过10秒，
                    多出来的线程还没有接到活儿，就会回收，最后保持池子里就100个
        第四个参数TimeUnit.SECONDS:如上
        第五个参数new LinkedBlockingQueue():用来放任务的集合
         */

        AtomicInteger number = new AtomicInteger();  //原子操作

        for (int i = 1; i <= 255; i++) {
            String testIP = ip_pre + "." + (i);   //没见过的操作
            threadPool.execute(new Runnable() {    //给线程池添加任务
                @Override
                public void run() {
                    boolean reachable = isReachable(testIP);
                    if (reachable)
                        // System.out.println("找到可连接的ip地址：" + testIP);
                        ips.add(testIP);

                    synchronized (number) {   //synchronized修饰代码块
                        System.out.println("已经完成:" + number.incrementAndGet() + " 个 ip 测试");
                    }
                }
            });
        }

        // 等待所有线程结束的时候，就关闭线程池
        threadPool.shutdown();
        //等待线程池关闭，但是最多等待1个小时
        if (threadPool.awaitTermination(1, TimeUnit.HOURS)) {
            System.out.println("如下ip地址可以连接:");
            for (String theip : ips) {
                System.out.println(theip);
            }
            System.out.println("总共有:" + ips.size() + " 个地址");

        }
    }


    private static boolean isReachable(String ip) {
        try {
            boolean reachable = false;

            Process p = Runtime.getRuntime().exec("ping -n 1 " + ip);
                                                //-n count：要发送的回显请求数。
                                                //没参数，windows下默认返回4次
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                if (line.length() != 0)
                    sb.append(line + "\r\n");
            }

            //当有TTL出现的时候，就表示连通了
            reachable = sb.toString().contains("TTL");
            br.close();
            return reachable;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }
}
