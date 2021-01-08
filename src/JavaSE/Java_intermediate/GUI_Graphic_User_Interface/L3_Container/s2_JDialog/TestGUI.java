package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L3_Container.s2_JDialog;

import javax.swing.*;

/*
JDialog也是窗体型容器，右上角没有最大和最小化按钮
 */

public class TestGUI {
    public static void main(String[] args) {

        //普通的窗体，带最大和最小化按钮，而对话框却不带
        JDialog d = new JDialog();
        d.setTitle("LOL");
        d.setSize(400, 300);
        d.setLocationRelativeTo(null);
        d.setLayout(null);
        JButton b = new JButton("一键秒对方基地挂");
        b.setBounds(50, 50, 280, 30);

        d.add(b);

        d.setVisible(true);


    }
}