
package com.one.container;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
import static com.one.container.GlobalVarible.*;

/**
 * ������(ͨ��ѡ��򵥡��еȡ����ѡ��Զ���ģʽ��ȷ���С��С��Լ��׵�����)
 * ���㰴�����������
 */
public class AddMines {

    public  static void setBackgoundData(){
        Random random=new Random();
        for (int i=0;i<mineCount; ){
            int r=random.nextInt(row);
            int c=random.nextInt(col);
            if (data[r][c]!=mineCode){ //��������Ӳ�Ϊ��ʱ������
                data[r][c]=mineCode;
                i++;
            }

        }

        //�����ܱߵ��׵�����
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                //�жϸõ��Ƿ�����
                if (data[i][j] == mineCode) continue;
                int tempCount=0; //�ܱ�����
                //����
                if (i>0 && j>0 && data[i-1][j-1]==mineCode) tempCount++; //����
                if (i>0 && data[i-1][j]==mineCode) tempCount++; //��
                if (i>0 && j<col-1 && data[i-1][j+1]==mineCode) tempCount++; //����
                if (j>0 && data[i][j-1]==mineCode) tempCount++;  //��
                if (j<col-1 && data[i][j+1]==mineCode) tempCount++;  //��
                if (i<row-1 && j>0 && data[i+1][j-1]==mineCode) tempCount++;  //����
                if (i<row-1 && data[i+1][j]==mineCode) tempCount++; //��
                if (i<row-1 && j<col-1 && data[i+1][j+1]==mineCode) tempCount++;  //����
                //
                data[i][j]=tempCount;
            }
        }
    }


}
