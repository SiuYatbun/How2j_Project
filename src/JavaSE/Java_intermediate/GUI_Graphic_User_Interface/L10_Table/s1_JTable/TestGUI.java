package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L10_Table.s1_JTable;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

/*
显示一个Table需要两组数据
1. 一维数组： String[]columnNames 表示表格的标题
2. 二维数组： String[][] heros 表格中的内容
默认情况下，表格的标题是不会显示出来了，除非使用了JScrollPane
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("JTable");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);

        // 表格上的title
        String[] columnNames = new String[] { "id", "name", "hp", "damage" };
        // 表格中的内容，是一个二维数组
        String[][] heros = new String[][] { { "1", "盖伦", "616", "100" },
                { "2", "提莫", "512", "102" }, { "3", "奎因", "832", "200" } };
        JTable t = new JTable(heros, columnNames);
        f.add(t, BorderLayout.CENTER);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}