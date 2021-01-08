package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L7_Component_Practices.s1_if_null;

/*
在JTextField中输入数据，在旁边加一个按钮JButton,当点击按钮的时候，
判断JTextFiled中有没有数据，并使用JOptionPane进行提示
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGUI {
    public static void main(String[] args) {
        //名字，大小，位置
        JFrame f = new JFrame("if null");
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout());

        JTextField tf = new JTextField();
        tf.setPreferredSize(new Dimension(80, 30));  //文本框大小

        JButton b = new JButton("检测");

        f.add(tf);
        f.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().equals("")){
                    JOptionPane.showMessageDialog(f,"文本内容为空");
                }
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
