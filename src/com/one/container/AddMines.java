
package com.one.container;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
import static com.one.container.GlobalVarible.*;

/**
 * 设置雷(通过选择简单、中等、困难、自定义模式，确定行、列、以及雷的数量)
 * 计算按键背后的数字
 */
public class AddMines {

    public  static void setBackgoundData(){
        Random random=new Random();
        for (int i=0;i<mineCount; ){
            int r=random.nextInt(row);
            int c=random.nextInt(col);
            if (data[r][c]!=mineCode){ //当这个格子不为雷时，埋雷
                data[r][c]=mineCode;
                i++;
            }

        }

        //计算周边的雷的数量
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                //判断该点是否是雷
                if (data[i][j] == mineCode) continue;
                int tempCount=0; //周边雷数
                //计算
                if (i>0 && j>0 && data[i-1][j-1]==mineCode) tempCount++; //左上
                if (i>0 && data[i-1][j]==mineCode) tempCount++; //上
                if (i>0 && j<col-1 && data[i-1][j+1]==mineCode) tempCount++; //右上
                if (j>0 && data[i][j-1]==mineCode) tempCount++;  //左
                if (j<col-1 && data[i][j+1]==mineCode) tempCount++;  //右
                if (i<row-1 && j>0 && data[i+1][j-1]==mineCode) tempCount++;  //左下
                if (i<row-1 && data[i+1][j]==mineCode) tempCount++; //下
                if (i<row-1 && j<col-1 && data[i+1][j+1]==mineCode) tempCount++;  //右下
                //
                data[i][j]=tempCount;
            }
        }
    }


}
