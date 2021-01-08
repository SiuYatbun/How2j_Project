package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L5_Component.s7_JComboBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/*
JComboBox：下拉框

使用getSelectedItem()来获取被选中项
使用setSelectedItem() 来指定要选中项
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("JComboBox");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        //下拉框出现的条目
        String[] boxes = new String[] { "下拉框选项1", "下拉框选项2" };
        JComboBox cb = new JComboBox(boxes);

        cb.setBounds(50, 50, 80, 30);

        f.add(cb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}