package com.one.container;

import javax.swing.*;

public class GlobalVarible {
    public static JFrame globalframe;

    public static int row=9;
    public static int col=9;
    public static int[][] data=new int[row][col]; //存储按钮下方的数字
    public  static JPanel under =new JPanel();
    public static int mineCount = 10; //雷的数量
    public static int mineCode =-1; //-1代表雷
    public static int unopened= row * col;
    public static int opened=0;


}



