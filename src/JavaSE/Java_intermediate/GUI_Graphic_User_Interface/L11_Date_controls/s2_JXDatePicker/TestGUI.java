package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L11_Date_controls.s2_JXDatePicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jdesktop.swingx.JXDatePicker;

/*
本例使用 包swingx-core-1.6.2.jar，界面比较简约，可以设置日期
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("JXDatePicker");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        Date date = new Date();

        final JXDatePicker datepick = new JXDatePicker();

        // 设置 date日期
        datepick.setDate(date);

        datepick.setBounds(110, 83, 177, 24);

        f.add(datepick);

        JButton b = new JButton("获取时间");
        b.setBounds(137, 183, 100, 30);
        f.add(b);

        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取 日期
                Date d = datepick.getDate();
                JOptionPane.showMessageDialog(f, "获取控件中的日期 :" + d);

            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}