package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L2_Listener.s1_ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
创建一个匿名类实现ActionListener接口，当按钮被点击时，actionPerformed方法就会被调用
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("Head sculpture");
        f.setSize(800, 800);
        f.setLocationRelativeTo(null);  //窗口至于屏幕中心
        f.setLayout(null);

        final JLabel l = new JLabel(); //JLabel用于显示文本或图像，或两者

        ImageIcon i = new ImageIcon("C:/Users/YATBUN/Pictures/head sculpture.jpg");
                                    //图片所在地址:C:\Users\YATBUN\Pictures
        l.setIcon(i);
        l.setBounds(60, 50, i.getIconWidth(), i.getIconHeight());

        JButton b = new JButton("隐藏图片");
        b.setBounds(350, 700, 100, 30);

        // 给按钮 增加 监听
        b.addActionListener(new ActionListener() {
            //匿名类
            // 当按钮被点击时，就会触发 ActionEvent事件
            // actionPerformed 方法就会被执行

            public void actionPerformed(ActionEvent e) {
                if(b.getText().contains("隐藏")){
                    l.setVisible(false);
                    b.setText("显示图片");
                }else{
                    l.setVisible(true);
                    b.setText("隐藏图片");
                }
            }
        });

        f.add(l);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}