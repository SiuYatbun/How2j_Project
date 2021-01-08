package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L10_Table.s9_input_check;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TestGUI {
    public static void main(String[] args) {

        final JFrame f = new JFrame("input check");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(new BorderLayout());

        final HeroTableModel htm = new HeroTableModel();

        final JTable t = new JTable(htm);
        JPanel p = new JPanel();

        final JLabel lName = new JLabel("名称");
        final JTextField tfName = new JTextField("");
        final JLabel lHp = new JLabel("血量");
        final JTextField tfHp = new JTextField("");
        JButton bAdd = new JButton("添加");
        tfName.setPreferredSize(new Dimension(80, 30));
        tfHp.setPreferredSize(new Dimension(80, 30));

        p.add(lName);
        p.add(tfName);
        p.add(lHp);
        p.add(tfHp);
        p.add(bAdd);

        bAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                HeroDAO dao = new HeroDAO();

                Hero h = new Hero();
                String name = tfName.getText();

                // 通过name长度判断 名称是否为空
                if (name.length() == 0) {
                    // 弹出对话框提示用户
                    JOptionPane.showMessageDialog(f, "名称不能为空");

                    // 名称输入框获取焦点
                    tfName.grabFocus();
                    return;
                }

                String hp = tfHp.getText().trim();

                try {
                    // 把hp转换为浮点型，如果出现异常NumberFormatException表示不是浮点型格式
                    Float.parseFloat(hp);
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(f, "血量只能是小数 ");
                    tfHp.grabFocus();
                    return;
                }

                h.name = name;

                h.hp = Float.parseFloat(hp);

                dao.add(h);

                htm.heros = dao.list();

                t.updateUI();

            }
        });

        JScrollPane sp = new JScrollPane(t);

        f.add(p, BorderLayout.NORTH);
        f.add(sp, BorderLayout.CENTER);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
