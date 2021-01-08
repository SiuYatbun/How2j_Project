package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L5_Component.s12_ProgressBar;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("ProgressBar");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);

        f.setLayout(new FlowLayout());

        JProgressBar pb = new JProgressBar();

        //进度条最大100
        pb.setMaximum(100);
        //当前进度是50
        pb.setValue(50);
        //显示当前进度
        pb.setStringPainted(true);

        f.add(pb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }

    /*

    >>>>>>>>用线程的方法实现0-100的进度条读取<<<<<<<<

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final JFrame f=new JFrame("ProgressBar");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout());
        final JProgressBar pb=new JProgressBar();
        new JavaSE.Java_intermediate.Thread(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for(int i=0;i<=100;i++) {
                    try {
                        JavaSE.Java_intermediate.Thread.sleep(100);
                        pb.setValue(i);
                    } catch (InterruptedException ie) {
                    }
                }
            }
        }).start();
        f.add(pb);
        pb.setStringPainted(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
     */
}