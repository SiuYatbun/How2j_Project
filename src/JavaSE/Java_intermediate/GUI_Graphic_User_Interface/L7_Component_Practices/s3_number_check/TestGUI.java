package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L7_Component_Practices.s3_number_check;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class TestGUI {
    public static void main(String[] args) {
        //名字，大小，位置
        JFrame f = new JFrame("number check");
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
                }else if(isInter(tf.getText())){

                }else {
                    JOptionPane.showMessageDialog(f,"文本内容不合法!!");
                }
            }


        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    private static boolean isInter(String s) {
        if(s.equals("")){
            return  false;
        }
        return Pattern.matches("\\d*",s);
    }

}
