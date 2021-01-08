package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L3_Container.s3_JDialog_modality;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/*
当一个对话框被设置为模态的时候，其背后的父窗体，是不能被激活的，除非该对话框被关闭
 */

public class TestGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("外部窗体");
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);

        // 根据外部窗体实例化JDialog
        JDialog d = new JDialog(f);
        // 设置为模态
        d.setModal(true);

        d.setTitle("模态的对话框");
        d.setSize(400, 300);
        d.setLocationRelativeTo(null);
        d.setLayout(null);
        JButton b = new JButton("一键秒对方基地挂");
        b.setBounds(50, 50, 280, 30);
        d.add(b);

        f.setVisible(true);
        d.setVisible(true);

    }
}