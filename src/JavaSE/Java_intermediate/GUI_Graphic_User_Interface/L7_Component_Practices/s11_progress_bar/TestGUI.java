package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L7_Component_Practices.s11_progress_bar;

import javax.swing.*;
import java.awt.*;


/*
设计一个线程，每隔100毫秒，就把进度条的进度+1。
从0%一直加到100%
刚开始加的比较快，以每隔100毫秒的速度增加，随着进度的增加，越加越慢，让处女座的使用者，干着急
变得多慢，根据你们和处女座同学，朋友的相处体验，自己把控
 */

public class TestGUI {

    public static void main(String[] args) {
        JFrame f = new JFrame("progress bar");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout());

        JProgressBar pb = new JProgressBar();
        pb.setStringPainted(true);   //显示当前进度


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0, j = 0; i <= 100; i++, j++) {
                        Thread.sleep(100 + j * 5);
                        pb.setValue(i);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        f.add(pb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
