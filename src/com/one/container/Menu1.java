package com.one.container;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.one.container.GlobalVarible.*;
public class Menu1 {
    public static void Menu(){
        //�˵���
        JMenuBar JMenuBar = new JMenuBar();

        //�˵����
        JMenu gameMenu = new JMenu("��Ϸ(G)");
        JMenu helpMenu = new JMenu("����(H)");

        //�˵������
        JMenuItem start = new JMenuItem("��ʼ");
        JMenuItem primary = new JMenuItem("����");
        JMenuItem intermediate = new JMenuItem("�м�");
        JMenuItem advanced = new JMenuItem("�߼�");
        JMenuItem customize = new JMenuItem("�Զ��弶");
        JMenuItem out = new JMenuItem("�˳�");

        JMenuItem gamerules = new JMenuItem("��Ϸ����");
        JMenuItem regarding = new JMenuItem("������Ϸ");

        //����ť����
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
                // ����һ�� JFrame ������Ϊ�Ի���ĸ�����
                JFrame frame = new JFrame("Confirm Dialog Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);
                Icon  cj = new ImageIcon("img//image//img.png");

                // ��ʾȷ�϶Ի���
                int result = JOptionPane.showConfirmDialog(frame, "��Ϸ����", "������Ϸ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, cj);


                // �����û���ѡ��ִ����Ӧ�Ĳ���
                if (result == JOptionPane.OK_OPTION) {
                    // �û������ȷ�ϰ�ť
                    System.out.println("User clicked OK");
                } else if (result == JOptionPane.CANCEL_OPTION) {
                    // �û������ȡ����ť
                    System.out.println("User clicked Cancel");
                } else {
                    // �û��ر��˶Ի�������˹رհ�ť
                    System.out.println("User closed the dialog");
                }

                // �رո�����
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
