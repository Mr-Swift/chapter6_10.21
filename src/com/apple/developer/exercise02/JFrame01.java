package com.apple.developer.exercise02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Map;

@SuppressWarnings("all")
public class JFrame01 extends JFrame {
    private JTextField jTextField01;
//    public String getName(){//获取输入的用户名
//        return jTextField01.getText();
//    }

    private JPasswordField jPasswordField01;//获取输入的密码
//    public String getPassword(){
//        return String.valueOf(jPasswordField01.getPassword());
//    }

    public JFrame01() {
        this.setSize(600, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jPanel01 = new JPanel();
        this.add(jPanel01);

        CardLayout cardLayout01 = new CardLayout();
        jPanel01.setLayout(cardLayout01);


        JPanel jPanel001 = new JPanel();
        jPanel01.add(jPanel001, "界面1");
        jPanel001.setLayout(null);

        JPanel jPanel002 = new JPanel();
        jPanel01.add(jPanel002, "界面2");
        jPanel002.setBackground(Color.PINK);
        jPanel002.setLayout(null);

        JLabel jLabel01 = new JLabel("用户登录", JLabel.CENTER);
        jLabel01.setBounds(250, 50, 80, 20);
        jLabel01.setFont(new Font("宋体", Font.BOLD, 20));
        jPanel001.add(jLabel01);

        JLabel jLabel02 = new JLabel("用户名： ", JLabel.CENTER);
        jLabel02.setBounds(100, 100, 80, 20);
        jLabel02.setFont(new Font("微软雅黑", Font.BOLD, 18));
        jPanel001.add(jLabel02);

        JLabel jLabel03 = new JLabel("密码： ", JLabel.CENTER);
        jLabel03.setBounds(100, 200, 80, 20);
        jLabel03.setFont(new Font("微软雅黑", Font.BOLD, 18));
        jPanel001.add(jLabel03);

        JLabel jLabel04 = new JLabel();//提示
        jLabel04.setBounds(250, 250, 250, 40);
        jLabel04.setFont(new Font("宋体", Font.BOLD, 15));
        jPanel001.add(jLabel04);


        jTextField01 = new JTextField();//用户名
        jTextField01.setBounds(190, 95, 250, 40);
        jPanel001.add(jTextField01);

        jPasswordField01 = new JPasswordField();//密码
        jPasswordField01.setBounds(190, 195, 250, 40);
        jPanel001.add(jPasswordField01);

        jPasswordField01.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    String getName = jTextField01.getText();
                    String getPassword = String.valueOf(jPasswordField01.getPassword());
                    Map map = User.getMap();
                    if (!map.containsKey(getName)) {
                        jLabel04.setText("查无此人！");
                    } else if (!getPassword.equals(map.get(getName))) {
                        jLabel04.setText("用户名密码错误！");
                    } else {
                        jLabel04.setText("登录成功！");
                        cardLayout01.show(jPanel01, "界面2");

                        JLabel jLabel05 = new JLabel(jTextField01.getText());
                        jLabel05.setFont(new Font("宋体", Font.BOLD, 20));
                        jLabel05.setBounds(250, 200, 300, 20);
                        jPanel002.add(jLabel05);
                    }
                }
            }
        });


        JButton jButton01 = new JButton("登录");
        jButton01.setBounds(200, 300, 80, 40);
        jButton01.setFont(new Font("宋体", Font.BOLD, 20));
        jPanel001.add(jButton01);
        JLabel jLabel05 = new JLabel(jTextField01.getText());
        jPanel002.add(jLabel05);
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getName = jTextField01.getText();
                String getPassword = String.valueOf(jPasswordField01.getPassword());
                Map map = User.getMap();
                if (!map.containsKey(getName)) {
                    jLabel04.setText("查无此人！");
                } else if (!getPassword.equals(map.get(getName))) {
                    jLabel04.setText("用户名密码错误！");
                } else {
                    jLabel04.setText("登录成功！");
                    cardLayout01.show(jPanel01, "界面2");

                    JLabel jLabel05 = new JLabel(jTextField01.getText());
                    jLabel05.setFont(new Font("宋体", Font.BOLD, 20));
                    jLabel05.setBounds(250, 200, 300, 20);
                    jPanel002.add(jLabel05);
                }
            }
        });

        JButton jButton02 = new JButton("重置");
        jButton02.setBounds(300, 300, 80, 40);
        jButton02.setFont(new Font("宋体", Font.BOLD, 20));
        jPanel001.add(jButton02);
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField01.setText("");
                jPasswordField01.setText("");
                jLabel04.setText("");
            }
        });


        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame01();
    }
}
