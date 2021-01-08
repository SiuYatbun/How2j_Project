package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L3_Container.s5_modalityANDsize_change;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGUI {
    public static void main(String[] args) {
        //设置主窗口(命名-大小-位置-布局)
        JFrame f = new JFrame("主窗口JFrame");
        f.setSize(800,800);  //设置窗口大小
        f.setLocationRelativeTo(null); //把JFrame窗口设置在屏幕中央
        //!注意！得先设置好窗口大小，再设置在屏幕中央
        f.setLayout(null);  //给主窗口设置一个布局(空布局)

        //设置主窗口中的按钮b1(命名-大小AND位置)
        JButton b1 = new JButton("打开一个模态窗口");
        b1.setBounds(290, 650, 200, 30);

        //把该按钮添加到主窗口中
        f.add(b1);

        //设置模态窗口(命名-大小-位置-是否为模态)
        JDialog d = new JDialog();
        d.setTitle("模态窗口JDialog"); //给模态窗口JDialog取名
        d.setSize(400, 300);
        d.setLocationRelativeTo(null);
        d.setModal(true);  //将次级窗口JDialog设置为模态
        d.setResizable(false);


        //为按钮b1添加监听事件
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setVisible(true);
            }
        });

        //设置模态窗口的按钮b2
        JButton b2 = new JButton("解锁设置大小的功能");

        //把该按钮添加到模态窗口中
        d.add(b2);

        //为按钮b2添加监听事件
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b2.getText().contains("解锁")){
                    d.setResizable(true);
                    b2.setText("关闭设置大小的功能");
                }else{
                    d.setResizable(false);
                    b2.setText("解锁设置大小的功能");
                }
            }
        });

        //把主窗口JFrame设置为点击右上角关闭按钮即关闭程序
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //将主窗口设置为可见状态
        f.setVisible(true);

    }
}
