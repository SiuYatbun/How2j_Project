package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L10_Table.s3_column_width;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
设置列宽度
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("Column width");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(new BorderLayout());

        String[] columnNames = new String[] { "id", "name", "hp", "damage" };
        String[][] heros = new String[][] { { "1", "盖伦", "616", "100" },
                { "2", "提莫", "512", "102" }, { "3", "奎因", "832", "200" } };
        JTable t = new JTable(heros, columnNames);

        JScrollPane sp = new JScrollPane(t);

        // 设置列宽度
        t.getColumnModel().getColumn(0).setPreferredWidth(200);

        f.add(sp, BorderLayout.CENTER);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}