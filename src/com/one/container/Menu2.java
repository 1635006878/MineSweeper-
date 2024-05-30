
package com.one.container;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.one.container.GlobalVarible.*;
import static javax.swing.BoxLayout.X_AXIS;

public class Menu2 {
    //重新开始按钮
    public static void main() {
        JPanel p =new JPanel();


        BoxLayout boxLayout = new BoxLayout(p,BoxLayout.X_AXIS);
        p.setLayout(boxLayout);

        //雷的数量


        JTextField textField = new JTextField() ;
        textField.setText(String.valueOf(mineCount));
        textField.setSize(80,40);
        textField.setEditable(false);
        textField.setPreferredSize(new Dimension(80,50));
        Font font = new Font("宋体", Font.PLAIN, 40); // 这里的20是字体大小，可以根据需要调整
        textField.setFont(font);
        p.add(textField);

        //中间
        JPanel restart = new JPanel();
        restart.setLayout(new CardLayout());


        ImageIcon guessIcon=new ImageIcon("img\\image\\face0.gif"); //按钮图
        JButton b1=new JButton(guessIcon);
        restart.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                

            }
        });

        ImageIcon guessIcon2=new ImageIcon("img\\image\\face3.gif"); //按钮图
        JButton b2=new JButton(guessIcon2);
        restart.add(b2);
        //重复b1

        ImageIcon guessIcon3=new ImageIcon("img\\image\\face4.gif"); //按钮图
        JButton b3=new JButton(guessIcon3);
        restart.add(b3);




        p.add(restart);


        //计时
        int time = 68;

        JTextField textField2 = new JTextField() ;
        textField2.setText(String.valueOf(time));
        textField2.setSize(80,40);
        textField2.setEditable(false);
        textField2.setPreferredSize(new Dimension(80,50));
        Font font2 = new Font("宋体", Font.PLAIN, 40); // 这里的20是字体大小，可以根据需要调整
        textField2.setFont(font2);
        p.add(textField2);





        p.setPreferredSize(new Dimension(270,30));
        under.add(p);
    }
}









