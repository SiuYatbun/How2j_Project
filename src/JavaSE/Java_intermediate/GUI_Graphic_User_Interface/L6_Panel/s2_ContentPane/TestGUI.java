package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L6_Panel.s2_ContentPane;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
JFrame上有一层面板，叫做ContentPane
平时通过f.add()向JFrame增加组件，其实是向JFrame上的 ContentPane加东西
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("ComtentPane");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        JButton b = new JButton("一键秒对方基地挂");
        b.setBounds(50, 50, 280, 30);

        f.add(b);
        // JFrame上有一层面板，叫做ContentPane
        // 平时通过f.add()向JFrame增加组件，其实是向JFrame上的 ContentPane加东西
        // f.add等同于f.getContentPane().add(b);
        f.getContentPane().add(b);

        // b.getParent()获取按钮b所处于的容器
        // 打印出来可以看到，实际上是ContentPane而非JFrame
        System.out.println(b.getParent());

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
