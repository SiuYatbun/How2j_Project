package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L5_Component.s1_JLabel;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
JLabel：用于显示文字
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("Label");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JLabel l = new JLabel("Label组件");
        //文字颜色
        l.setForeground(Color.red);
        l.setBounds(50, 50, 280, 30);

        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
