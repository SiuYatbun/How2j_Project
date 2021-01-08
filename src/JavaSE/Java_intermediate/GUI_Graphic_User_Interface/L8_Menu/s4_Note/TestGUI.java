package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L8_Menu.s4_Note;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

/*
练习-完成一个完整的记事本界面
 */

public class TestGUI {

    public static void main(String[] args) {
        JFrame f=new JFrame("记事本");
        f.setBounds(300, 300, 400, 300);
        f.setLayout(new FlowLayout());
        JMenuBar mb=new JMenuBar();
        JMenu m1=new JMenu("文件(F)");
        JMenu m2=new JMenu("编辑(E)");
        JMenu m3=new JMenu("格式(O)");
        JMenu m4=new JMenu("查看(V)");
        JMenu m5=new JMenu("帮助(H)");
        String[]str1={"新建(N)","打开(O)","保存(S)","另存为(A)","页面设置(U)","打印(P)","退出(X)"};
        for (String string : str1) {
            m1.add(new JMenuItem(string));
        }
        String[]str2={"撤销(U)","剪切(T)","复制(C)","粘贴(P)","删除(L)","查找(F)","查找上一个(V)","查找下一个(N)","替换(R)","转到(G)","全选(A)"};
        for (String string : str2) {
            m2.add(new JMenuItem(string));
        }
        String[]str3={"自动换行(W)","字体(F)"};
        for (String string : str3) {
            m3.add(new JMenuItem(string));
        }
        String[]str4={"缩放(Z)","状态栏(S)"};
        for (String string : str4) {
            m4.add(new JMenuItem(string));
        }
        String[]str5={"查看帮助(H)","发送反馈(F)","关于记事本(A)"};
        for (String string : str5) {
            m5.add(new JMenuItem(string));
        }
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
        JTextArea ta=new JTextArea();
        ta.setPreferredSize(new Dimension(370,240));
        f.add(ta);
        f.setJMenuBar(mb);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

}