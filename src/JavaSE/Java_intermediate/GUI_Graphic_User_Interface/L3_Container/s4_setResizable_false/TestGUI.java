package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L3_Container.s4_setResizable_false;

import javax.swing.JButton;
import javax.swing.JFrame;
/*
通过调用方法 setResizable(false); 做到窗体大小不可变化
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JButton b = new JButton("一键秒对方基地挂");
        b.setBounds(50, 50, 280, 30);

        f.add(b);
        // 窗体大小不可变化
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}