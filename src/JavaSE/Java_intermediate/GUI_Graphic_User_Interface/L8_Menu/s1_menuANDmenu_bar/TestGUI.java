package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L8_Menu.s1_menuANDmenu_bar;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/*
菜单栏和菜单
 */

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("Menu AND menu bar");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        // 菜单栏
        JMenuBar mb = new JMenuBar();

        // 菜单
        JMenu mHero = new JMenu("英雄");
        JMenu mItem = new JMenu("道具");
        JMenu mWord = new JMenu("符文");
        JMenu mSummon = new JMenu("召唤师");
        JMenu mTalent = new JMenu("天赋树");

        // 把菜单加入到菜单栏
        mb.add(mHero);
        mb.add(mItem);
        mb.add(mWord);
        mb.add(mSummon);
        mb.add(mTalent);

        // 把菜单栏加入到frame，这里用的是set而非add
        f.setJMenuBar(mb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}