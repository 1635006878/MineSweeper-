package com.one.container;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.one.container.GlobalVarible.*;
public class Menu1 {
    public static void Menu(){
        //菜单条
        JMenuBar JMenuBar = new JMenuBar();

        //菜单组件
        JMenu gameMenu = new JMenu("游戏(G)");
        JMenu helpMenu = new JMenu("帮助(H)");

        //菜单项组件
        JMenuItem start = new JMenuItem("开始");
        JMenuItem primary = new JMenuItem("初级");
        JMenuItem intermediate = new JMenuItem("中级");
        JMenuItem advanced = new JMenuItem("高级");
        JMenuItem customize = new JMenuItem("自定义级");
        JMenuItem out = new JMenuItem("退出");

        JMenuItem gamerules = new JMenuItem("游戏规则");
        JMenuItem regarding = new JMenuItem("关于游戏");

        //各按钮功能
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        primary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Menu3.main();
            }
        });
        intermediate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                row = 12;col = 12;
                mineCount = 40;
                Menu3.main();
            }
        });
        advanced.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                row = 16;col = 30;
                mineCount = 100;
                Menu3.main();
            }
        });
        customize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu3.main();
            }
        });
        out.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        gamerules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        regarding.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 创建一个 JFrame 对象作为对话框的父窗口
                JFrame frame = new JFrame("Confirm Dialog Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);
                Icon  cj = new ImageIcon("img//image//img.png");

                // 显示确认对话框
                int result = JOptionPane.showConfirmDialog(frame, "游戏开发", "关于游戏", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, cj);


                // 根据用户的选择执行相应的操作
                if (result == JOptionPane.OK_OPTION) {
                    // 用户点击了确认按钮
                    System.out.println("User clicked OK");
                } else if (result == JOptionPane.CANCEL_OPTION) {
                    // 用户点击了取消按钮
                    System.out.println("User clicked Cancel");
                } else {
                    // 用户关闭了对话框或点击了关闭按钮
                    System.out.println("User closed the dialog");
                }

                // 关闭父窗口
                frame.dispose();
            }
        });

        gameMenu.add(start);
        gameMenu.addSeparator();
        gameMenu.add(primary);
        gameMenu.addSeparator();
        gameMenu.add(intermediate);
        gameMenu.addSeparator();
        gameMenu.add(advanced);
        gameMenu.addSeparator();
        gameMenu.add(customize);
        gameMenu.addSeparator();
        gameMenu.add(out);

        helpMenu.add(gamerules);
        helpMenu.addSeparator();
        helpMenu.add(regarding);

        JMenuBar.add(gameMenu);
        JMenuBar.add(helpMenu);
        globalframe.setJMenuBar(JMenuBar);





    }
}
