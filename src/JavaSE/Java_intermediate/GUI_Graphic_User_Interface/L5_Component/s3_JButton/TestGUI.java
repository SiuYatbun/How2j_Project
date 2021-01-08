package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L5_Component.s3_JButton;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
JButton：普通按钮
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("JButton");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JButton b = new JButton("Button组件");
        b.setBounds(50, 50, 280, 30);

        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}