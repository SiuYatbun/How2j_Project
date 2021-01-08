package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L4_Layout.s4_GridLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
GridLayout，即网格布局器
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("GridLayout");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        // 设置布局器为GridLayerout，即网格布局器
        // 该GridLayerout的构造方法表示该网格是2行3列
        f.setLayout(new GridLayout(2, 3));

        JButton b1 = new JButton("rows:1,cols:1");
        JButton b2 = new JButton("rows:1,cols:2");
        JButton b3 = new JButton("rows:1,cols:3");
        JButton b4 = new JButton("rows:2,cols:1");
        JButton b5 = new JButton("rows:2,cols:2");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}