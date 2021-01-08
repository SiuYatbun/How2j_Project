package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L5_Component.s6_ButtonGroup;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/*
ButtonGroup：对按钮进行分组，把不同的按钮，放在同一个分组里，同一时间，只有一个按钮会被选中
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("ButtonGroup(只有一个按钮被选中)");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        JRadioButton b1 = new JRadioButton("单选框1");
        b1.setSelected(true);
        b1.setBounds(50, 50, 130, 30);

        JRadioButton b2 = new JRadioButton("单选框2");
        b2.setBounds(50, 100, 130, 30);

        // 按钮分组
        ButtonGroup bg = new ButtonGroup();
        // 把b1，b2放在 同一个 按钮分组对象里 ，这样同一时间，只有一个 按钮 会被选中
        bg.add(b1);
        bg.add(b2);

        f.add(b1);
        f.add(b2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
