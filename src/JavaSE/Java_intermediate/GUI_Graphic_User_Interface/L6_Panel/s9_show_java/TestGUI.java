package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L6_Panel.s9_show_java;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/*
参考eclipse的风格，借助TabbedPanel显示一个包下所有的java文件
 */

public class TestGUI {

    public static void main(String[] args) {
        File file = new File("E:\\How2j_Project");
        JFrame f = new JFrame(file.getName() + "中的java文件");
        f.setBounds(200, 200, 800, 500);
        f.setLayout(null);

        List<String> fileList = new ArrayList<>();

        JTabbedPane tp = new JTabbedPane();
        int i = 0;
//        ImageIcon ii = new ImageIcon("D:/Downloads/j.png");
        for (String s : listFiles(file, fileList)) {         //遍历集合中的元素:java文件
            File file1 = new File(s);
            try (FileReader fr = new FileReader(file1);
                 BufferedReader br = new BufferedReader(fr)) {
                JTextArea ta = new JTextArea();
                ta.setPreferredSize(new Dimension(200, 150));
                ta.setLineWrap(true);
                ta.setText("");
                while (true) {
                    // 一次读一行
                    String line = null;
                    if ((line = br.readLine()) == null)
                        break;
                    ta.append(line + "\n");
                }
                tp.add(ta);
                tp.setTitleAt(i, file1.getName());
//                tp.setIconAt(i, ii);
                i++;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        f.setContentPane(tp);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static List<String> listFiles(File file, List<String> fileList) {
        if (file.isFile() && file.getName().endsWith(".java")) {
            fileList.add(file.getAbsolutePath());
        }
        if (file.isDirectory()) {          //若这个文件是个文件夹
            File[] fs = file.listFiles();
            if (fs != null) {              //若该文件夹不为空，则继续遍历
                for (File f : fs) {
                    listFiles(f, fileList);
                }
            }
        }
        return fileList;
    }
}
