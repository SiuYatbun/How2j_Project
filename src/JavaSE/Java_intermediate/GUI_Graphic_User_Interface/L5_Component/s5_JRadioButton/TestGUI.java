package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L5_Component.s5_JRadioButton;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

/*
JRadioButton：单选框
使用isSelected来获取是否选中了

在这个例子里，两个单选框可以被同时选中，为了实现只能选中一个，还需要用到ButtonGroup->s6
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("JradioButton(所有按钮都可以被选中)");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        JRadioButton b1 = new JRadioButton("单选框1");
        // 设置为默认被选中
        b1.setSelected(true);
        b1.setBounds(50, 50, 130, 30);

        JRadioButton b2 = new JRadioButton("单选框2");
        b2.setBounds(50, 100, 130, 30);

        System.out.println(b2.isSelected());

        f.add(b1);
        f.add(b2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}