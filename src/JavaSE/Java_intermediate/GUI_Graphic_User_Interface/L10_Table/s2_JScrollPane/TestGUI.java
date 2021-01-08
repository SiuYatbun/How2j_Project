package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L10_Table.s2_JScrollPane;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
JScrollPane: 带滚动条的Panel
把table放进去就可以看到table的title
同样的把textarea放进去，并且textarea内容够长的话，就会看到滚动条
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("JScrollPane");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(new BorderLayout());

        String[] columnNames = new String[] { "id", "name", "hp", "damage" };
        String[][] heros = new String[][] { { "1", "盖伦", "616", "100" },
                { "2", "提莫", "512", "102" }, { "3", "奎因", "832", "200" } };
        JTable t = new JTable(heros, columnNames);

        // 根据t创建 JScrollPane
        JScrollPane sp = new JScrollPane(t);

        //或则创建一个空的JScrollPane，再通过setViewportView把table放在JScrollPane中
        // JScrollPane sp = new JScrollPane(t);
        // sp.setViewportView(t);

        // 把sp而非JTable加入到JFrame上，
        f.add(sp, BorderLayout.CENTER);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}