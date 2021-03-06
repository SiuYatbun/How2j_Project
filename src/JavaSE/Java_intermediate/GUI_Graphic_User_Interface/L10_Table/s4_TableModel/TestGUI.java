package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L10_Table.s4_TableModel;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("TableModel");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(new BorderLayout());

        //创建一个TableModel
        HeroTableModel htm= new HeroTableModel();

        //根据 TableModel来创建 Table
        JTable t = new JTable(htm);

        JScrollPane sp = new JScrollPane(t);

        f.add(sp, BorderLayout.CENTER);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}