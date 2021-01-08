package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L5_Component.s4_JCheckBox;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

/*
JCheckBox：复选框

setSelected(true)默认被选中
使用isSelected()来获取是否选中了
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("JCheckBox");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        JCheckBox bCheckBox1 = new JCheckBox("复选框1");
        //设置为默认被选中
        bCheckBox1.setSelected(true);
        bCheckBox1.setBounds(50, 50, 130, 30);

        JCheckBox bCheckBox2 = new JCheckBox("复选框2");
        bCheckBox2.setBounds(50, 100, 130, 30);

        //判断是否被选中
        System.out.println(bCheckBox2.isSelected());

        f.add(bCheckBox1);
        f.add(bCheckBox2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}