package com.one.container;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

import java.awt.*;
import static com.one.container.GlobalVarible.*;
public class Menu3 {
    public static void main() {

//        JPanel p =new JPanel();
//        //����һ����ɫ��ϸ�߱߿��������Ա���ɨ����Ϸ�ļ���ԣ�ͬʱ��ɫ��һ������ɫ�������ɢ��ҵ�ע����
//        Border border1 = BorderFactory.createLineBorder(Color.GRAY);
//
//
//        //����һ����ɫ�İ��۱߿����ֱ߿�������΢�İ��ݸУ����������רע�ڸ������ĵ�����
////        Border border2 = BorderFactory.createEtchedBorder(Color.GRAY, Color.GRAY);
//
//        //����һ��ֻ���ϱ߿�Ļ�ɫʵ�߱߿���������ƿ�������ҵ�������Ȼ�ش��������ƶ�������ɨ����Ϸ�Ĳ���ϰ��
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

                ImageIcon guessIcon = new ImageIcon("img\\image\\blank.gif"); //��ťͼ
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

                con.add(panel); //��ʾ

            }
        }
        con.setPreferredSize(new Dimension(270,270));
        under.add(con);
        under.setSize(270,300);

        globalframe.add(under);
    }


}
