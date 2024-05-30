package com.one.container;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

import java.awt.*;
import static com.one.container.GlobalVarible.*;
public class Menu3 {
    public static void main() {

//        JPanel p =new JPanel();
//        //创建一个灰色的细线边框，这样可以保持扫雷游戏的简洁性，同时灰色是一种中性色，不会分散玩家的注意力
//        Border border1 = BorderFactory.createLineBorder(Color.GRAY);
//
//
//        //创建一个灰色的凹槽边框，这种边框会给人轻微的凹陷感，有助于玩家专注于格子中心的内容
////        Border border2 = BorderFactory.createEtchedBorder(Color.GRAY, Color.GRAY);
//
//        //创建一个只有上边框的灰色实线边框，这样的设计可以让玩家的视线自然地从上往下移动，符合扫雷游戏的操作习惯
//        Border topBorder = BorderFactory.createMatteBorder(1, 0, 0, 0, Color.GRAY);
//
////        Border combinedBorder = BorderFactory.createCompoundBorder(topBorder, emptyBorder);
////        combinedBorder = BorderFactory.createCompoundBorder(combinedBorder, border2);
//        Border combinedBorder = BorderFactory.createCompoundBorder(topBorder, border1);
//
//        p.setBorder(combinedBorder);
//        under.add(p);


        JPanel con=new JPanel();
        con.setLayout(new GridLayout(row,col));



        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                JPanel panel = new JPanel();
                panel.setLayout(new CardLayout());

                ImageIcon guessIcon = new ImageIcon("img\\image\\blank.gif"); //按钮图
                JButton b1 = new JButton(guessIcon);


                b1.setOpaque(true);
                b1.setContentAreaFilled(false);
                b1.setBorderPainted(false);
                b1.setPreferredSize(new Dimension(100, 100));
                b1.setSize(100, 100);
                panel.add(b1);


                if(data[i][j]==-1)
                {
                    ImageIcon guessIcon1=new ImageIcon("img\\image\\blood.gif");
                    JLabel imageL = new JLabel(guessIcon1);
                    panel.add(imageL);

                    ImageIcon guessIcon2=new ImageIcon("img\\image\\0.gif");
                    JLabel imageL2 = new JLabel(guessIcon2);
                    panel.add(imageL2);
                }
                else if(data[i][j]==0){
                    ImageIcon guessIcon1=new ImageIcon("img\\image\\0.gif");
                    JLabel imageL = new JLabel(guessIcon1);
                    panel.add(imageL);
                }
                else if(data[i][j]==1){
                    ImageIcon guessIcon1=new ImageIcon("img\\image\\1.gif");
                    JLabel imageL = new JLabel(guessIcon1);
                    panel.add(imageL);
                }
                else if(data[i][j]==2){
                    ImageIcon guessIcon1=new ImageIcon("img\\image\\2.gif");
                    JLabel imageL = new JLabel(guessIcon1);
                    panel.add(imageL);
                }
                else if(data[i][j]==3){
                    ImageIcon guessIcon1=new ImageIcon("img\\image\\3.gif");
                    JLabel imageL = new JLabel(guessIcon1);
                    panel.add(imageL);
                }
                else if(data[i][j]==4){
                    ImageIcon guessIcon1=new ImageIcon("img\\image\\4.gif");
                    JLabel imageL = new JLabel(guessIcon1);
                    panel.add(imageL);
                }
                else if(data[i][j]==5){
                    ImageIcon guessIcon1=new ImageIcon("img\\image\\5.gif");
                    JLabel imageL = new JLabel(guessIcon1);
                    panel.add(imageL);
                }
                else if(data[i][j]==6){
                    ImageIcon guessIcon1=new ImageIcon("img\\image\\6.gif");
                    JLabel imageL = new JLabel(guessIcon1);
                    panel.add(imageL);
                }
                else if(data[i][j]==7){
                    ImageIcon guessIcon1=new ImageIcon("img\\image\\7.gif");
                    JLabel imageL = new JLabel(guessIcon1);
                    panel.add(imageL);
                }
                else if(data[i][j]==8){
                    ImageIcon guessIcon1=new ImageIcon("img\\image\\8.gif");
                    JLabel imageL = new JLabel(guessIcon1);
                    panel.add(imageL);
                }

                con.add(panel); //显示

            }
        }
        con.setPreferredSize(new Dimension(270,270));
        under.add(con);
        under.setSize(270,300);

        globalframe.add(under);
    }


}
