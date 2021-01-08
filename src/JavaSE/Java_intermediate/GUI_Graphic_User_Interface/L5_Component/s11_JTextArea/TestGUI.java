package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L5_Component.s11_JTextArea;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/*
JTextArea：文本域

和文本框JTextField不同的是，文本域可以输入多行数据
如果要给文本域初始文本，通过\n来实现换行效果
JTextArea通常会用到append来进行数据追加

如果文本太长，会跑出去，可以通过setLineWrap(true) 来做到自动换行
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("JTextArea");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);

        f.setLayout(new FlowLayout());

        JLabel l = new JLabel("文本域：");

        JTextArea ta = new JTextArea();
        ta.setPreferredSize(new Dimension(200, 150));
        //\n换行符
        ta.setText("抢人头！\n抢你妹啊抢！\n");
        //追加数据
        ta.append("我去送了了了了了了了了了了了了了了了了了了了了了了了了");
        //设置自动换行
        ta.setLineWrap(true);
        f.add(l);
        f.add(ta);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
