package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L5_Component.s2_JLabel_ImageIcon;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
java GUI 显示图片是通过在label上设置图标实现的
!注!： 这里的图片路径是C:/Users/YATBUN/Pictures/head sculpture.jpg，所以要确保这里有图片，不然不会显示
!注!： 图片的后缀名和真实格式，必须保持一致，否则很有可能无法正常显示。
什么意思呢？就是文件本来是jpg的，但是仅仅是把后缀名修改成了png,那么会导致显示失败。
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("JLabel");
        f.setSize(800, 800);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        JLabel l = new JLabel();

        //根据图片创建ImageIcon对象
        ImageIcon i = new ImageIcon("C:/Users/YATBUN/Pictures/head sculpture.jpg");
        //设置ImageIcon
        l.setIcon(i);
        //label的大小设置为ImageIcon,否则显示不完整
        l.setBounds(60, 50, i.getIconWidth(), i.getIconHeight());

        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}