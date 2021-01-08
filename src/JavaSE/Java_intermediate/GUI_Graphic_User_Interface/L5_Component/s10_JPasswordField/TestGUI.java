package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L5_Component.s10_JPasswordField;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/*
JPasswordField：密码框
与文本框不同，获取密码框里的内容，推荐使用getPassword，该方法会返回一个字符数组，而非字符串
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("JPasswordField");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);

        f.setLayout(new FlowLayout());

        JLabel l = new JLabel("密码：");
        // 密码框
        JPasswordField pf = new JPasswordField("");
        pf.setText("&48kdh4@#");
        pf.setPreferredSize(new Dimension(80, 30));

        // 与文本框不同，获取密码框里的内容，推荐使用getPassword，该方法会返回一个字符数组，而非字符串
        char[] password = pf.getPassword();
        String p = String.valueOf(password);
        System.out.println(p);

        f.add(l);
        f.add(pf);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}