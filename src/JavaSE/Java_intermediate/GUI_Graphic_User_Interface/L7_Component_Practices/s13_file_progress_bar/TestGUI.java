package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L7_Component_Practices.s13_file_progress_bar;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

/*
改进练习-复制文件夹提供进度条，把文件复制的进度显示出来。
 */

public class TestGUI {
    public static long Size = 0;
    public static long srcSize = 0;
    public static long destSize = 0;
    public static String srcStr = null;
    public static String destStr = null;

    public static void main(String[] args) throws IOException {
        JFrame jf = new JFrame("复制文件");
        jf.setSize(350, 200);
        jf.setLayout(new GridLayout(3, 1));
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 地址
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(2, 3));
        JLabel jb1 = new JLabel("原文件地址");
        JTextField jf1 = new JTextField();
        JLabel jb2 = new JLabel("目标地址");
        JTextField jf2 = new JTextField();
        // 原文件选择器
        JFileChooser jcs = new JFileChooser();
        jcs.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);  //在文件选择模式中显示文件以及目录
        jcs.setFileFilter(new FileFilter() {

            @Override
            public String getDescription() {
                // TODO Auto-generated method stub
                return "";
            }

            @Override
            public boolean accept(File f) {
                // TODO Auto-generated method stub
                return true;
            }
        });

        JButton jbChoose = new JButton("选择文件");
        jbChoose.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int result = jcs.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    srcStr = jcs.getSelectedFile().getAbsolutePath();
                    if (srcStr != null)
                        jf1.setText(srcStr);

                }
            }
        });
        // 目标位置文件选择器
        JFileChooser jcs1 = new JFileChooser();
        jcs1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);  //在文件选择模式中仅显示目录
        JButton jbChoose1 = new JButton("选择位置");
        jbChoose1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int result = jcs1.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    destStr = jcs1.getSelectedFile().getAbsolutePath();
                    if (destStr != null)
                        jf2.setText(destStr);
                }
            }
        });
        jp1.add(jb1);
        jp1.add(jf1);
        jp1.add(jbChoose);
        jp1.add(jb2);
        jp1.add(jf2);
        jp1.add(jbChoose1);
        jf.add(jp1);
        // 开始复制
        JPanel jp2 = new JPanel();
        JButton jbt = new JButton("开始复制");
        jp2.setLayout(new FlowLayout());
        jp2.add(jbt);
        jf.add(jp2);
        // 进度条
        JPanel jp3 = new JPanel();
        JProgressBar jpb = new JProgressBar();
        jpb.setMaximum(100);
        jpb.setStringPainted(true);
        jp3.add(jpb);
        jf.add(jp3);
        jf.setVisible(true);

        jbt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                jbt.setText("正在复制");
                jpb.setValue(0);
                srcStr = jf1.getText();                   //重新赋值
                destStr = jf2.getText();
                Size = 0;
                srcSize = 0;
                Thread t2 = new Thread() {
                    public void run() {
                        try {
                            CopyFolder(srcStr, destStr);
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                };
                t2.start();
                Thread t1 = new Thread() {
                    public void run() {
                        srcSize = getFolderSize(srcStr);
                        jbt.setEnabled(false);       //设置为不可选状态
                        jbChoose.setEnabled(false);
                        jbChoose1.setEnabled(false);
                        while (true) {
                            Size = 0;
                            destSize = getFolderSize(destStr + "/" +
                                    srcStr.substring(srcStr.lastIndexOf("\\")));
                            //为文件绝对路径添加后续路径时，最好用/来作为地址的分隔符，
                            // 但用java语句得到的绝对路径是用\\作为地址的分隔符的
                            jpb.setValue((int) (destSize == 0 ? 0 : destSize * 100 / srcSize));
                            if (destSize == srcSize) {
                                JOptionPane jop = new JOptionPane("完成");
                                jop.showMessageDialog(jf, "复制完成！");
                                jbt.setText("开始复制");
                                jbt.setEnabled(true);
                                jbChoose.setEnabled(true);
                                jbChoose1.setEnabled(true);
                                break;
                            }
                        }
                    }
                };
                t1.start();

            }
        });
    }

    public static void CopyFolder(String srcStr, String destStr) throws IOException {
        File Folder = new File(srcStr);
        if (Folder.isDirectory()) {      //判断是否为文件夹
            File[] files = Folder.listFiles();             //若是文件夹，则对其进行遍历操作
            destStr = destStr + "/" + Folder.getName();    //在目的存放路径中创建一个与源文件一样文件名的文件夹
            File destFolder = new File(destStr);
            destFolder.mkdir();                            //创建文件夹
            for (File file : files) {                      //若还是文件夹，递归操作
                    CopyFolder(file.getAbsolutePath(), destFolder.toString());
            }
        } else {               //若是文件，直接调用文件复制方法
            File destFile = new File(destStr + "/" + Folder.getName());
            copyFile(Folder, destFile);
        }
    }

    public static void copyFile(File file,File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while((len=bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();
    }

    public static long getFolderSize(String Address) {
        File file = new File(Address);
        if (!file.exists()) {         //若文件不存在，则返回0
            return 0;
        }
        if (file.isFile()) {          //若是文件，则返回文件大小--字节长度
            Size = file.length();
            return Size;
        }
        File[] files = file.listFiles();   //若是文件夹，则遍历
        for (File f : files) {
            if (f.isDirectory()) {
                getFolderSize(f.getAbsolutePath());
            } else {
                Size += f.length();          //返回该文件夹内文件的总大小
            }
        }
        return Size;
    }
}
