package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L2_Listener.s2_KeyListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
键盘监听器： KeyListener
keyPressed 代表 键被按下
keyReleased 代表 键被弹起
keyTyped 代表 一个按下弹起的组合动作
KeyEvent.getKeyCode() 可以获取当前点下了哪个键

38代表按下了 “上键”
40代表按下了 “下键”
37代表按下了 “左键”
39代表按下了 “右键”
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("Head sculpture");
        f.setSize(800, 800);
        f.setLocationRelativeTo(null);  //窗口至于屏幕中心
        f.setLayout(null);

        final JLabel l = new JLabel();

        ImageIcon i = new ImageIcon("C:/Users/YATBUN/Pictures/head sculpture.jpg");
                                            //图片所在地址:C:\Users\YATBUN\Pictures
        l.setIcon(i);
        l.setBounds(60, 50, i.getIconWidth(), i.getIconHeight());

        // 增加键盘监听
        f.addKeyListener(new KeyListener() {
            //匿名类
            // 键被弹起
            public void keyReleased(KeyEvent e) {
                /* 38代表按下了 “上键”
                   40代表按下了 “下键”
                   37代表按下了 “左键”
                   39代表按下了 “右键”
                 */

                if (e.getKeyCode() == 38) {
                    // 图片向上移动 （x坐标不变，y坐标增加）
                    l.setLocation(l.getX(), l.getY() - 10);
                }else if (e.getKeyCode() == 40) {
                    // 图片向下移动 （x坐标不变，y坐标减小）
                    l.setLocation(l.getX(), l.getY() + 10);
                }else if (e.getKeyCode() == 37) {
                    // 图片向左移动 （x坐标减小，y坐标不变）
                    l.setLocation(l.getX() - 10, l.getY());
                }else if (e.getKeyCode() == 39) {
                    // 图片向右移动 （x坐标增加，x坐标不变）
                    l.setLocation(l.getX() + 10, l.getY());
                }
            }

            //键被按下
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
            }

            // 一个按下弹起的组合动作
            public void keyTyped(KeyEvent e) {
            }
        });

        f.add(l);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}