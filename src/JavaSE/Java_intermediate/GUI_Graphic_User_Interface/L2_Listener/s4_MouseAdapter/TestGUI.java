package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L2_Listener.s4_MouseAdapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
MouseAdapter--鼠标监听适配器
一般说来在写监听器的时候，会实现MouseListener。
但是MouseListener里面有很多方法实际上都没有用到，比如mouseReleased ，mousePressed，mouseExited等等。
这个时候就可以使用 鼠标监听适配器，MouseAdapter 只需要重写必要的方法即可。
 */

public class TestGUI {
    public static void main(String[] args) {

        final JFrame f = new JFrame("Head sculpture");
        f.setSize(800, 800);
        f.setLocationRelativeTo(null);    //窗口至于屏幕中心
        f.setLayout(null);

        final JLabel l = new JLabel();
        ImageIcon i = new ImageIcon("C:/Users/YATBUN/Pictures/head sculpture.jpg");
        //图片所在地址:C:\Users\YATBUN\Pictures
        l.setIcon(i);
        l.setBounds(60, 50, i.getIconWidth(), i.getIconHeight());

        f.add(l);

        // MouseAdapter 适配器，只需要重写用到的方法，没有用到的就不用写了
        l.addMouseListener(new MouseAdapter() {

            // 只有mouseEntered用到了
            public void mouseEntered(MouseEvent e) {

                Random r = new Random();

                int x = r.nextInt(f.getWidth() - l.getWidth());
                int y = r.nextInt(f.getHeight() - l.getHeight());

                l.setLocation(x, y);

            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}