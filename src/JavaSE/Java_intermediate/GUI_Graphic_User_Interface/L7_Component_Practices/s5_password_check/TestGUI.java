package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L7_Component_Practices.s5_password_check;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class TestGUI {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c =DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/password?useSSL=false" +
                        "&serverTimezone=UTC&allowPublicKeyRetrieval=true", //8.0版本
                "root",
                "srb86606212");
        Statement s = c.createStatement();

        //名字，大小，位置
        JFrame f = new JFrame("password check");
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout());

        JLabel lAccount = new JLabel("账号:");
        JLabel lPassword = new JLabel("密码:");
        JTextField tfAccount = new JTextField();
        JTextField tfPassword = new JTextField();
        tfAccount.setPreferredSize(new Dimension(100, 30));  //文本框大小
        tfPassword.setPreferredSize(new Dimension(100, 30));

        JButton b = new JButton("登录");

        f.add(lAccount);
        f.add(tfAccount);
        f.add(lPassword);
        f.add(tfPassword);
        f.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tfAccount.getText().equals("") || tfPassword.getText().equals("")){
                    JOptionPane.showMessageDialog(f,"账号或密码都不允许为空!!");
                }

                String sql = "select * from account where account = '"+tfAccount.getText()+
                        "' and password = '"+tfPassword.getText()+"'";
                try {
                    ResultSet rs = s.executeQuery(sql);
                    if(rs.next()){
                        JOptionPane.showMessageDialog(f,"登录成功,喜提邵太!!");
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
