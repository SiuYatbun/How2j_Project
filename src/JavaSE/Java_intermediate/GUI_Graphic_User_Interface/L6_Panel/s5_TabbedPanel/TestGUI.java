package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L6_Panel.s5_TabbedPanel;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("TabbedPanel");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.RED);
        p1.setLayout(new FlowLayout());

        JButton b1 = new JButton("英雄1");
        JButton b2 = new JButton("英雄2");
        JButton b3 = new JButton("英雄3");

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.BLUE);
        JButton b4 = new JButton("英雄4");
        JButton b5 = new JButton("英雄5");
        JButton b6 = new JButton("英雄6");

        p2.add(b4);
        p2.add(b5);
        p2.add(b6);


        JTabbedPane tp = new JTabbedPane();
        tp.add(p1);
        tp.add(p2);

        // 设置tab的标题
        tp.setTitleAt(0, "红色tab");
        tp.setTitleAt(1, "蓝色tab");

        //设置tab的图标
//        ImageIcon i = new ImageIcon("e:/project/j2se/j.png");
//        tp.setIconAt(0,i);
//        tp.setIconAt(1,i);

        f.setContentPane(tp);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
