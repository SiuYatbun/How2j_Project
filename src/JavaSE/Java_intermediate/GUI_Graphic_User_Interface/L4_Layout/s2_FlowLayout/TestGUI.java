package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L4_Layout.s2_FlowLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
设置布局器为FlowLayout,顺序布局器
容器上的组件水平摆放
加入到容器即可，无需单独指定大小和位置
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("FlowLayout");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        // 设置布局器为FlowLayerout
        // 容器上的组件水平摆放
        f.setLayout(new FlowLayout());

        JButton b1 = new JButton("英雄1");
        JButton b2 = new JButton("英雄2");
        JButton b3 = new JButton("英雄3");

        // 加入到容器即可，无需单独指定大小和位置
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}